package com.ds.repository.placesmodelrepository;

import java.util.List;

import com.ds.model.places.Branch;

public interface BranchDao {
public int save(final Branch branch) throws Exception;
public boolean update(final Branch branch) throws Exception;
public boolean delete(final Branch branch) throws Exception;
public Branch find(final int id) throws Exception;
public List<Branch> findAll() throws Exception;
}
