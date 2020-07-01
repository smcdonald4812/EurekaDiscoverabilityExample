package com.cognixia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryController {

	@GetMapping("/countries")
	public String getCountry() {
		return "<table border=1><tr>"
				+ "<td>USA</td></tr><tr>"
				+ "<td>China</td></tr>"
				+ "<tr><td>India</td></tr>"
				+ "<tr><td>Pakistan</td></tr>"
				+ "<tr><td>Canada</td></tr>"
				+ "</table>";
	}
}
