package com.ds.repository.placesmodelrepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.model.places.Branch;
import com.ds.model.usermodel.Address;
@Repository
public class BranchDaoImpl implements BranchDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int save(Branch branch) throws Exception {
		return (int) ht.save(branch);
	}

	@Override
	public boolean update(Branch branch) throws Exception {
		ht.update(branch);
	}

	@Override
	public boolean delete(Branch branch) throws Exception {
		ht.delete(branch);
		return true;
	}

	@Override
	public Branch find(int id) throws Exception {
		return ht.get(Branch.class, id);

	}

	@Override
	public List<Branch> findAll() throws Exception {
		List<Branch> branches=ht.find("from Branch");
		return branches;
	}


}
