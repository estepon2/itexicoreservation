package com.reservacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reservacion.entities.Reservation;
import com.reservacion.repository.ReservationRepository;

@SpringBootApplication
public class ReservacionesApplication implements CommandLineRunner{
	
	@Autowired
	ReservationRepository reservationRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReservacionesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Reservation> listOfReservations = new ArrayList<>();
		listOfReservations.add(new Reservation(1,"Reservation No 1",LocalDateTime.now()));
		listOfReservations.add(new Reservation(2,"Reservation No 2",LocalDateTime.now()));
		listOfReservations.add(new Reservation(3,"Reservation No 3",LocalDateTime.now()));
		listOfReservations.add(new Reservation(4,"Reservation No 4",LocalDateTime.now()));
		listOfReservations.add(new Reservation(5,"Reservation No 5",LocalDateTime.now()));
		
		reservationRepository.saveAll(listOfReservations);
		
	}

}
