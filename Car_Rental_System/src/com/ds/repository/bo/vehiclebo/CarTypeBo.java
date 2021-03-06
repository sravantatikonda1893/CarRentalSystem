package com.ds.repository.bo.vehiclebo;

import java.util.List;

import com.ds.model.places.Location;

public interface CarTypeBo {
public int createLocation(Location location) throws Exception;
public boolean updateLocation(Location location) throws Exception;
public boolean deleteLocation(Location location) throws Exception;
public Location selectLocation(int id) throws Exception;
public List<Location> selectAllLocations() throws Exception;

}
