package com.cognixia;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityController {
	
	@Autowired
	CityUtil cs;

	@GetMapping("/cities")
	public String getCountries() {
		Map<String, List<String>> cities = cs.getList();
		StringBuilder sb = new StringBuilder("<table border=1>");
		sb.append("<tr><td>USA<td>");
		cities.get("USA").forEach(x -> sb.append("<td>"+x+"</td>"));
		sb.append("</tr>");
		sb.append("<tr><td>China<td>");
		cities.get("China").forEach(x -> sb.append("<td>"+x+"</td>"));
		sb.append("</tr>");
		sb.append("<tr><td>India<td>");
		cities.get("India").forEach(x -> sb.append("<td>"+x+"</td>"));
		sb.append("</tr>");
		sb.append("<tr><td>Pakastan<td>");
		cities.get("Pakistan").forEach(x -> sb.append("<td>"+x+"</td>"));
		sb.append("</tr>");
		sb.append("<tr><td>Canada<td>");
		cities.get("Canada").forEach(x -> sb.append("<td>"+x+"</td>"));
		sb.append("</tr>");
		sb.append("</table>");
		return sb.toString();
	}
}
