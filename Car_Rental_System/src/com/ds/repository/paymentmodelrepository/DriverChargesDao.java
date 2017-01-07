package com.ds.repository.paymentmodelrepository;

import java.util.List;

import com.ds.model.usermodel.Employee;

public interface DriverChargesDao {
public int save(final Employee employee) throws Exception;
public boolean update(final Employee employee) throws Exception;
public boolean delete(final Employee employee) throws Exception;
public Employee find(final int id) throws Exception;
public List<Employee> findAll() throws Exception;
}
