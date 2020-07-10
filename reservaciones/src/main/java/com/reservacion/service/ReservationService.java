package com.reservacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservacion.entities.Reservation;
import com.reservacion.repository.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	public List<Reservation> getAllReservations(){
		return reservationRepository.findAll();		
	}

}
