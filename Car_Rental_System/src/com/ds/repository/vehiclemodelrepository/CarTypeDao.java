package com.ds.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.model.usermodel.Driver;

public interface CarTypeDao {
	//final makes it unchageable, should be same as recieved by buisness logic
public int save(final Driver driver) throws Exception;
public boolean update(final Driver driver) throws Exception;
public boolean delete(final Driver driver) throws Exception;
public Driver find(final int id) throws Exception;
public List<Driver> findAll() throws Exception;
}
