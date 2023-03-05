package com.ticketing.TicketGeneration.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TicketModel {
    @NotEmpty(message = "Source needed")
    private String source;

    @NotEmpty(message = "Destination needed")
    private String destination;

    @NotNull(message = "UserId required")
    private Long userId;

    @NotNull(message = "Quantity needed")
    private Integer quantity;

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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
