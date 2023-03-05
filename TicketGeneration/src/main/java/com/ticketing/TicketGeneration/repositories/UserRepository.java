package com.ticketing.TicketGeneration.repositories;

import com.ticketing.TicketGeneration.dtos.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Long> {
}
