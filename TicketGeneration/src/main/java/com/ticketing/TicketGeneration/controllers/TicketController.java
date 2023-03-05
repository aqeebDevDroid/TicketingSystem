package com.ticketing.TicketGeneration.controllers;

import com.ticketing.TicketGeneration.models.ApiResponse;
import com.ticketing.TicketGeneration.models.TicketModel;
import com.ticketing.TicketGeneration.models.TicketResponseModel;
import com.ticketing.TicketGeneration.models.UserModel;
import com.ticketing.TicketGeneration.service.TicketService;
import com.ticketing.TicketGeneration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/create")
    public ApiResponse createTicket(@Valid  @RequestBody TicketModel ticketModel) {
        TicketResponseModel ticketResponseModel = ticketService.createTicket(ticketModel);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Ticket created successfully, please make payment before journey begins");
        apiResponse.setData(ticketResponseModel);
        return apiResponse;
    }
}
