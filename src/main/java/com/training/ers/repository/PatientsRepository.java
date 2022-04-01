package com.training.ers.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.ers.models.Patient;

public interface PatientsRepository extends CrudRepository<Patient, Integer> {

}
