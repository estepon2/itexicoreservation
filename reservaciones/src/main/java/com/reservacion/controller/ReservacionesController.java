package com.reservacion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservacion.entities.Reservation;
import com.reservacion.repository.ReservationRepository;
import com.reservacion.service.ReservationService;

@RestController
@RequestMapping("/")
public class ReservacionesController {
	
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/reservations")
	public @ResponseBody ResponseEntity<List<Reservation>> getAllReservations(){
		List<Reservation> list = new ArrayList<>();   
		list = reservationService.getAllReservations();
		if(list.isEmpty())
			return new ResponseEntity<>(list,HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<>(list,HttpStatus.OK);
		
	}

}
