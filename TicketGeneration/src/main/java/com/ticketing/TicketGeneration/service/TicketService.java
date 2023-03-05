package com.ticketing.TicketGeneration.service;

import com.ticketing.TicketGeneration.convertor.TicketConvertor;
import com.ticketing.TicketGeneration.dtos.TicketDto;
import com.ticketing.TicketGeneration.dtos.TripInfoDto;
import com.ticketing.TicketGeneration.dtos.UserDto;
import com.ticketing.TicketGeneration.exception.CustomException;
import com.ticketing.TicketGeneration.models.TicketModel;
import com.ticketing.TicketGeneration.models.TicketResponseModel;
import com.ticketing.TicketGeneration.repositories.TicketRepository;
import com.ticketing.TicketGeneration.repositories.TripInfoRepository;
import com.ticketing.TicketGeneration.repositories.UserRepository;
import com.ticketing.TicketGeneration.service.interfaces.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService implements ITicketService {

    @Autowired
    TripInfoRepository tripInfoRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public TicketResponseModel createTicket(TicketModel ticketModel) {
        Optional<UserDto> optionalUserDto = userRepository.findById(ticketModel.getUserId());
        if(optionalUserDto.isPresent()) {
            Optional<TripInfoDto> optionalTripInfoDto = tripInfoRepository.findBySourceAndDestination(ticketModel.getSource(), ticketModel.getDestination());
            if (optionalTripInfoDto.isPresent()) {
                if (ticketModel.getQuantity() <= optionalTripInfoDto.get().getAvailableSeats()) {
                    TicketDto ticketDto = TicketConvertor.convertModelToDto(ticketModel);
                    double ticketAmount = optionalTripInfoDto.get().getBaseFare() * ticketModel.getQuantity();
                    double additionalCost = ticketAmount * 0.05;
                    double finalAmount = ticketAmount + additionalCost;
                    ticketDto.setFare(finalAmount);
                    ticketRepository.save(ticketDto);
                    reduceAvailableSeats(ticketModel.getQuantity(), optionalTripInfoDto.get());
                    return TicketConvertor.getTicketResponse(ticketModel, finalAmount);
                } else {
                     throw new CustomException("No seats available");
                }
            } else {
                throw new CustomException("No trip available for given source or destination");
            }
        } else {
            throw new CustomException("User is invalid");
        }
    }

    private void reduceAvailableSeats(int quantity, TripInfoDto tripInfoDto) {
        tripInfoDto.setAvailableSeats(tripInfoDto.getAvailableSeats() - quantity);
        tripInfoRepository.save(tripInfoDto);
    }
}
