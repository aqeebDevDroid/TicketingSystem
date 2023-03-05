package com.ticketing.TicketGeneration.exception;

import javax.persistence.PersistenceException;

public class CustomException extends PersistenceException {
    public CustomException(String message) {
        super(message);
    }
}
