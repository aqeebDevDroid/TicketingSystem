package com.ticketing.TicketGeneration.repositories;

import com.ticketing.TicketGeneration.dtos.TripInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TripInfoRepository extends JpaRepository<TripInfoDto, Long> {
    Optional<TripInfoDto> findBySourceAndDestination(String source, String destination);
}
