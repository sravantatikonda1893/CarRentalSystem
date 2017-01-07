package com.ds.repository.bo.userbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.model.usermodel.Employee;
import com.ds.repository.usermodelrepository.EmployeeDao;
@Service
@Transactional
public class EmployeeBoImpl implements EmployeeBo{
	@Autowired
	private EmployeeDao dao;

	@Override
	public int createEmployee(Employee employee) throws Exception {
		return dao.save(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		return dao.update(employee);
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Exception {
		return dao.delete(employee);
	}

	@Override
	@Transactional(readOnly=true)
	public Employee selectEmployee(int id) throws Exception {
		return (Employee) dao.find(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Employee> selectAllEmployees() throws Exception {
		return dao.findAll();
	}

}
//find and findAll methods are read only. Internally, if they want to want to change the data. That is not possible by using this configuration