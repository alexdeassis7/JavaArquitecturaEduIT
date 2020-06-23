package com.educacionit.Bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.Bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
