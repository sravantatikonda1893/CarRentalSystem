package com.ds.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.model.usermodel.User;

public interface FuelTypeDao {
	//final makes it unchageable, should be same as recieved by buisness logic
public int save(final User user) throws Exception;
public boolean update(final User user) throws Exception;
public boolean delete(final User user) throws Exception;
public User find(final int id) throws Exception;
public List<User> findAll() throws Exception;
}
