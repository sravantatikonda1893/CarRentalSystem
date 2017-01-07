package com.ds.repository.bo.transactionbo;

import java.util.List;

import com.ds.model.places.Branch;
import com.ds.model.usermodel.Employee;

public interface CarSaleRecordBo {
public int createBranch(Branch branch) throws Exception;
public boolean updateBranch(Branch branch) throws Exception;
public boolean deleteBranch(Branch branch) throws Exception;
public Branch selectBranch(int id) throws Exception;
public List<Employee> selectAllBranches() throws Exception;

}
