package com.training.ers.security.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ers.models.Appointment;
import com.training.ers.repository.AppointmentRepository;




@Service 
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Override
	public String bookAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
		return "AppointmentBook";
	}

	@Override
	public boolean apptExists(int appointmentId) {
		Optional<Appointment> appointment = appointmentRepository.findById(appointmentId);
		return appointment.isPresent();
	}
	@Override
	public List<Appointment> getAppointments() {
		return (List<Appointment>) appointmentRepository.findAll();

	}
	
}
