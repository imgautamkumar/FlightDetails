package com.madhav.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhav.location.entities.Location;
import com.madhav.location.repo.LocationRepositry;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepositry repository;

	@Override
	public Location saveLocation(Location location) {

		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int Id) {
		return repository.getOne(Id);
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

	public LocationRepositry getRepository() {
		return repository;
	}

	public void setRepository(LocationRepositry repository) {
		this.repository = repository;
	}

}
