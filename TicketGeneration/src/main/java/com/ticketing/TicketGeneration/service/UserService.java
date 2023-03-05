package com.ticketing.TicketGeneration.service;

import com.ticketing.TicketGeneration.convertor.UserConvertor;
import com.ticketing.TicketGeneration.dtos.UserDto;
import com.ticketing.TicketGeneration.models.UserModel;
import com.ticketing.TicketGeneration.repositories.UserRepository;
import com.ticketing.TicketGeneration.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(UserModel userModel) {
        UserDto userDto = UserConvertor.convertModelToDto(userModel);
        userRepository.save(userDto);
    }
}
