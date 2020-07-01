package com.cognixia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.stereotype.Component;

@Component
public class CityUtil {
	Map<String, List<String>> l = new HashMap<>();
	List<String> a = new Vector<>(), b = new Vector<>(), c = new Vector<>(), d = new Vector<>(), e = new Vector<>();
	public CityUtil() {
		loadCities();
		loadCountries();
	}
	private void loadCities() {
		a.add("District of Columbia");
		a.add("New York");
		a.add("Las Angeles");
		a.add("San Diego");
		a.add("Miami");
		
		b.add("Beijing");
		b.add("Shanghai");
		b.add("Wuhan");
		b.add("Shenzhen");
		b.add("Chengdu");
		
		c.add("Mumbai");
		c.add("Bengaluru");
		c.add("Chennai");
		c.add("Kolkata");
		c.add("Hyderabad");
		
		d.add("Karachi");
		d.add("Lahore");
		d.add("Islamabad");
		d.add("Pashwar");
		d.add("Multan");
		
		e.add("Halifax");
		e.add("Quebec City");
		e.add("Ottawa");
		e.add("Hamilton");
		e.add("Kitchener");
	}
	private void loadCountries() {
		l.put("USA", a);
		l.put("China", b);
		l.put("India", c);
		l.put("Pakistan", d);
		l.put("Canada", e);
	}
	public List<String> getList(String country) {
		return l.get(country);
	}
	public Map<String, List<String>> getList() {
		return l;
	}

}
