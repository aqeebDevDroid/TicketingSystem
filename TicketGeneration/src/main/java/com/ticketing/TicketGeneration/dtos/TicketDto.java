package com.ticketing.TicketGeneration.dtos;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class TicketDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id", nullable = false)
    private Long ticketId;

    private String source;

    private String destination;

    private long userId;

    private double fare;

    private int quantity;

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

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
}
