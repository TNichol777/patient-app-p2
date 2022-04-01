package com.training.ers.security.services;

import java.util.List;

import com.training.ers.models.Appointment;

public interface AppointmentService {
	
	public String bookAppointment(Appointment appointment);
	public boolean apptExists(int appointmentId);
	public List<Appointment> getAppointments();

}
