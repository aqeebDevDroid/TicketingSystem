package com.ticketing.TicketGeneration.convertor;

import com.ticketing.TicketGeneration.dtos.TicketDto;
import com.ticketing.TicketGeneration.models.TicketModel;
import com.ticketing.TicketGeneration.models.TicketResponseModel;

public class TicketConvertor {

    public static TicketDto convertModelToDto(TicketModel ticketModel) {
        TicketDto ticketDto = new TicketDto();
        ticketDto.setDestination(ticketModel.getDestination());
        ticketDto.setQuantity(ticketModel.getQuantity());
        ticketDto.setSource(ticketModel.getSource());
        ticketDto.setUserId(ticketModel.getUserId());
        return ticketDto;
    }

    public static TicketResponseModel getTicketResponse(TicketModel ticketModel, double totalAmount) {
        TicketResponseModel ticketResponseModel = new TicketResponseModel();
        ticketResponseModel.setDestination(ticketModel.getDestination());
        ticketResponseModel.setSource(ticketModel.getSource());
        ticketResponseModel.setTicketAmount(totalAmount);
        ticketResponseModel.setQuantity(ticketModel.getQuantity());
        ticketResponseModel.setUserId(ticketModel.getUserId());
        return ticketResponseModel;
    }
}
