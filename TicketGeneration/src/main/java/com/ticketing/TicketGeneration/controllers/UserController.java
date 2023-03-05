package com.ticketing.TicketGeneration.controllers;

import com.ticketing.TicketGeneration.models.ApiResponse;
import com.ticketing.TicketGeneration.models.UserModel;
import com.ticketing.TicketGeneration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ApiResponse createUser(@Valid  @RequestBody UserModel userModel) {
        userService.createUser(userModel);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("User created successfully");
        return apiResponse;
    }
}
