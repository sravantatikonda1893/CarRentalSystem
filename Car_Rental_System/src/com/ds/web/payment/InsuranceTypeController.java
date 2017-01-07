package com.ds.web.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.model.places.Branch;
import com.ds.repository.bo.placesbo.BranchBo;

@Controller("/")
public class InsuranceTypeController {
	@Autowired
	private BranchBo brancheBo;
	@RequestMapping(method=RequestMethod.POST, params="/createBranch.html")
	public @ResponseBody Branch createBranch(@RequestBody Branch branch) throws Exception{
		int id=brancheBo.createBranch(branch);
		if(id!=0)
			return branch;
		else 
			return new Branch();
	}
	@RequestMapping(method=RequestMethod.POST, params="/updateBranch.html")
	public @ResponseBody Branch updateBranch(@RequestBody Branch branch) throws Exception{
		boolean i=brancheBo.updateBranch(branch);
		if(i==true)	
			return branch;
		else return new Branch();
	}
	@RequestMapping(method=RequestMethod.POST, params="/deleteBranch.html")
	public @ResponseBody boolean deleteBranch(@PathVariable(value="id") int id) throws Exception{
		Branch b=new Branch();
		b.setBranchId(id);
		boolean i=brancheBo.deleteBranch(b);
		return i;
	}
	@RequestMapping(method=RequestMethod.GET, params="/findBranch.html")
	public @ResponseBody Branch findBranch(@PathVariable(value="id") int id) throws Exception{
		Branch br =brancheBo.selectBranch(id);
		return br;
	}
	@RequestMapping(method=RequestMethod.GET, params="/findAllBranches.html")
	public @ResponseBody List<Branch>  findBranch() throws Exception{
		List<Branch> brs =brancheBo.selectAllBranches();
		return brs;
	}

}
