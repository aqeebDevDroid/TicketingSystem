package com.ticketing.TicketGeneration.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TicketResponseModel {
    private String source;

    private String destination;

    private Long userId;

    private Integer quantity;

    private double ticketAmount;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(double ticketAmount) {
        this.ticketAmount = ticketAmount;
    }
}
