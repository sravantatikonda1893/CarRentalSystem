package com.ds.repository.placesmodelrepository;

import java.util.List;

import com.ds.model.places.Location;

public interface LocationDao {
	//final makes it unchageable, should be same as recieved by buisness logic
public int save(final Location location) throws Exception;
public boolean update(final Location location) throws Exception;
public boolean delete(final Location location) throws Exception;
public Location find(final int id) throws Exception;
public List<Location> findAll() throws Exception;
}
