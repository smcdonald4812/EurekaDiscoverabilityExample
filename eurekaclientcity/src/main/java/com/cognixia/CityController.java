package com.cognixia;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityController {
	
	@Autowired
	CityUtil cs;
	
	@GetMapping("/{country}")
	public String getCities(@PathVariable String country) {
		List<String> list = new Vector<>();
		String l = new String("");
		Map<String, List<String>> cities = cs.getList();
		if(cities.get(country)!=null) {
			list = cities.get(country);
			for(String city: list) l += city+" ";
		}
		else {
			list = cities.get("USA");
			for(String city: list) l += city+" ";
		}
		return l;
	}
}
