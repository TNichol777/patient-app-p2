package com.training.ers.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.ers.models.Appointment;



public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

}
