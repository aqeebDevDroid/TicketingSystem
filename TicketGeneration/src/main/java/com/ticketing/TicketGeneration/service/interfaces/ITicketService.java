package com.ticketing.TicketGeneration.service.interfaces;

import com.ticketing.TicketGeneration.models.TicketModel;
import com.ticketing.TicketGeneration.models.TicketResponseModel;

public interface ITicketService {
    TicketResponseModel createTicket(TicketModel ticketModel);
}
