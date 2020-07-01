package com.cognixia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@RestController
public class DiscoverController {
	@Autowired
	private EurekaClient eurekaClient;

	//Gets all instances in the server
	@GetMapping("/discover")
	public String getDiscoveredClientInfo(@RequestParam(name = "name") String servicename) {
		System.out.println(servicename);
		Application application = eurekaClient.getApplication(servicename);
		StringBuffer response = new StringBuffer();
		if (application != null && application.size() > 0) {
			for (InstanceInfo instanceInfo : application.getInstances()) {
				response.append(instanceInfo.getId()).append(" :      ");
			    response.append(instanceInfo.getHomePageUrl()).append(System.lineSeparator());
			}
			return response.toString();
		}
		else
		{
			return "Service Requested either doesn't exist or not found!";
		}
	}
}
