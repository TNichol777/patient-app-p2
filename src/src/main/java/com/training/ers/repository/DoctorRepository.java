package com.training.ers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.ers.models.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

	List<Doctor> findByDoctorName(String doctorName);

	@Query("FROM Doctor d WHERE d.specialty LIKE :spec AND d.location_city LIKE :loccity AND d.location_state LIKE :locstate AND d.insurance_Excepted LIKE :insexec ")
	public List<Doctor> findByMySpecialtyLocation_CityLocation_StateInsurance_Excepted(@Param("spec") String specialty,
			@Param("loccity") String location_city, @Param("locstate") String location_state,
			@Param("insexec") String insurance_Excepted);

}
