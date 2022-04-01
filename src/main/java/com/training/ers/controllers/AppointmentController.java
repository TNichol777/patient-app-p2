package com.training.ers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ers.models.Appointment;
import com.training.ers.security.services.AppointmentService;




@RestController
@RequestMapping ("appointment")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping
	public ResponseEntity<String> bookAppointment(@RequestBody Appointment appointment) { // localhost:5050/Doctor -POST

		ResponseEntity<String> responseEntity = null;
		String result = null;
			result = appointmentService.bookAppointment(appointment);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.CREATED);// 201 }

		
		return responseEntity;
	}
	@GetMapping
	public ResponseEntity<List<Appointment>> getAppointments() { // LOCALHOST:5050/Doctor -GET
		ResponseEntity<List<Appointment>> responseEntity = null;
		List<Appointment> result = null;
			result = appointmentService.getAppointments();
			responseEntity = new ResponseEntity<List<Appointment>>(result, HttpStatus.OK);
		
		return responseEntity;
	}
	
}
