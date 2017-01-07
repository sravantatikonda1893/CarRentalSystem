package com.ds.repository.bo.vehiclebo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.model.usermodel.User;
import com.ds.repository.usermodelrepository.UserDao;
@Service
@Transactional
public class CarTypeBoImpl implements CarTypeBo{
	@Autowired
	private UserDao dao;

	@Override
	public int createUser(User user) throws Exception{
		return 	dao.save(user);
	}

	@Override
	public boolean updateUser(User user) throws Exception{
		dao.update(user);
		return true;
	}

	@Override
	public boolean deleteUser(User user) throws Exception{
		dao.delete(user);
	return true;
	}

	@Override
	@Transactional(readOnly=true)
	public User selectUser(int id) throws Exception{
	return	dao.find(id);

	}

	@Override
	@Transactional(readOnly=true)
	public List<User> selectAllUsers() throws Exception{
		return dao.findAll();
	}

}
//find and findAll methods are read only. Internally, if they want to want to change the data. That is not possible by using this configuration