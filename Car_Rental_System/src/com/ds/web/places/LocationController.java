package com.ds.web.places;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.model.places.Branch;
import com.ds.model.places.Location;
import com.ds.repository.bo.placesbo.BranchBo;
import com.ds.repository.bo.placesbo.LocationBo;

@Controller
public class LocationController {
	@Autowired
	private LocationBo locationBo;
	@RequestMapping(method=RequestMethod.GET, value="/location.html")
	public @ResponseBody String createLocation(@PathVariable("street") String street, @PathVariable("city") String city,
			@PathVariable("state") String state, @PathVariable("zipcode") String zipcode) throws Exception{
		Location l=new Location(0, street, city, state, zipcode);
		int i=locationBo.createLocation(l);
		return ""+i;
	}

}
