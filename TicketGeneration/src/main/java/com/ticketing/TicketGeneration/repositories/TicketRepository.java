package com.ticketing.TicketGeneration.repositories;

import com.ticketing.TicketGeneration.dtos.TicketDto;
import com.ticketing.TicketGeneration.dtos.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketDto, Long> {
}
