package com.training.ers.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="appointment")

public class Appointment {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int appointmentId;
	private String doctorName;
	private String patientName;
	private String insurance;
	private String time;
	
	

}
