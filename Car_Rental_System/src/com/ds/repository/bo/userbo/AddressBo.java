package com.ds.repository.bo.userbo;

import java.util.List;

import com.ds.model.usermodel.Employee;

public interface AddressBo {
public int createEmployee(Employee employee) throws Exception;
public boolean updateEmployee(Employee employee) throws Exception;
public boolean deleteEmployee(Employee employee) throws Exception;
public Employee selectEmployee(int id) throws Exception;
public List<Employee> selectAllEmployees() throws Exception;

}
