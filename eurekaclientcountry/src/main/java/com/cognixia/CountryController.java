package com.cognixia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryController {
	private String country[] = {"USA","China","India","Pakistan","Canada"};
	@GetMapping("/countries")
	public String getCountry() {
		String s = new String("<table border=1>");
		for(int i = 0;i < country.length; i++) {
			s+="<tr><td>"+country[i]+"</td></tr>";
		}
		s+= "</table>";
		return s;
	}
}
