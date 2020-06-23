package com.educacionit.Bike.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.educacionit.Bike.models.Bike;
import com.educacionit.Bike.repositories.BikeRepository;
import java.util.List;


@RestController
@RequestMapping("api/v1/bikes")
public class BikeController {
	@Autowired
	private BikeRepository bk;
	
	//End Point que retorna la lista de bicicletas 
	@GetMapping
	public List<Bike> lista(){		
		return bk.findAll();		
	}	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		bk.save(bike);
	}	
	@GetMapping("/borrar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public boolean delete(@PathVariable long id) {
		if(bk.existsById(id)) {
			bk.deleteById(id);
			return true ;
		}else return false;		
	}	
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		return bk.getOne(id);
	}
	

}
