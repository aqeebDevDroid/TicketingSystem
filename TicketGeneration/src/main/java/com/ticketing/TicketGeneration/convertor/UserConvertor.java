package com.ticketing.TicketGeneration.convertor;

import com.ticketing.TicketGeneration.dtos.UserDto;
import com.ticketing.TicketGeneration.models.UserModel;

public class UserConvertor {

    public static UserDto convertModelToDto(UserModel userModel) {
        UserDto userDto = new UserDto();
        userDto.setName(userModel.getName());
        userDto.setAddress(userModel.getAddress());
        userDto.setEmail(userModel.getEmail());
        userDto.setMobileNo(userModel.getMobileNo());
        return userDto;
    }
}
