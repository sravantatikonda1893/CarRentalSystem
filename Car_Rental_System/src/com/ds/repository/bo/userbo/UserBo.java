package com.ds.repository.bo.userbo;

import java.util.List;

import com.ds.model.usermodel.User;

public interface UserBo {
public int createUser(User user) throws Exception;
public boolean updateUser(User user) throws Exception;
public boolean deleteUser(User user) throws Exception;
public User selectUser(int id) throws Exception;
public List<User> selectAllUsers() throws Exception;

}
