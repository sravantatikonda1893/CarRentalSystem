package com.ds.repository.bo.vehiclebo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.model.places.Branch;
import com.ds.model.usermodel.Employee;
import com.ds.repository.placesmodelrepository.BranchDao;
import com.ds.repository.usermodelrepository.EmployeeDao;
@Service
@Transactional
public class FuelTypeBoImpl implements CarBo{
	@Autowired
	private BranchDao bDao;

	@Override
	public int createBranch(Branch branch) throws Exception {
		return bDao.save(branch);
	}

	@Override
	public boolean updateBranch(Branch branch) throws Exception {
		return bDao.update(branch);
	}

	@Override
	public boolean deleteBranch(Branch branch) throws Exception {
		return bDao.delete(branch);
	}

	@Override
	public Branch selectBranch(int id) throws Exception {
		return bDao.find(id);

	}

	@Override
	public List<Branch> selectAllBranches() throws Exception {
		return bDao.findAll();
	}
}
