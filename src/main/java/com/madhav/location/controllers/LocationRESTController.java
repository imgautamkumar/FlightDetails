package com.madhav.location.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhav.location.entities.Location;
import com.madhav.location.repo.LocationRepositry;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	LocationRepositry locationRepositry;

	@GetMapping
	public List<Location> getLocations() {
		return locationRepositry.findAll();

	}

	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationRepositry.save(location);

	}

	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return locationRepositry.save(location);

	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locationRepositry.deleteById(id);
	}

	@GetMapping("/{id}")
	public Optional<Location> getLocation(@PathVariable("id") int id) {
		return locationRepositry.findById(id);  
	}
}
