package com.CinemaApp.repository;

import com.CinemaApp.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat,Long> {
    List<Seat> findByStatus(Boolean status);
}
