package com.ds.repository.transactionmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.model.usermodel.Employee;
@Repository
public class CarSaleRecordDaoImpl implements CarSaleRecordDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int save(Employee employee) throws Exception
	{
		return(Integer)ht.save(employee);

	}

	@Override
	public boolean update(Employee employee) throws Exception{
		ht.update(employee);
		return true;	
	}

	@Override
	public boolean delete(Employee Employee) throws Exception{
		ht.delete(Employee);
		return true;
	}

	@Override
	public Employee find(int id) throws Exception{
		return (Employee)ht.get(Employee.class, id);

	}

	@Override
	public List<Employee> findAll() throws Exception{
		List<Employee> employees=	ht.find("from employee");
		return employees;
	}

}
