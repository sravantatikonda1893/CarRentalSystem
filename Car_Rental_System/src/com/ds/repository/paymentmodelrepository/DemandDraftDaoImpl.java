package com.ds.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.model.usermodel.Driver;
@Repository
public class DemandDraftDaoImpl implements DemandDraftDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int save(Driver driver) throws Exception
	{
		return(Integer)ht.save(driver);

	}

	@Override
	public boolean update(Driver driver) throws Exception{
		ht.update(driver);
		return true;	
	}

	@Override
	public boolean delete(Driver driver) throws Exception{
		ht.delete(driver);
		return true;
	}

	@Override
	public Driver find(int id) throws Exception{
		return (Driver)ht.get(Driver.class, id);

	}

	@Override
	public List<Driver> findAll() throws Exception{
		List<Driver> drivers=	ht.find("from driver");
		return drivers;
	}

}
