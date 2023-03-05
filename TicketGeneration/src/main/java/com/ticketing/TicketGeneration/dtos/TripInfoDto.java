package com.ticketing.TicketGeneration.dtos;

import javax.persistence.*;

@Entity
@Table(name = "tripInformation")
public class TripInfoDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trip_id", nullable = false)
    private Long tripId;

    private String source;

    private String destination;

    private int availableSeats;

    private double baseFare;

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

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }
}
