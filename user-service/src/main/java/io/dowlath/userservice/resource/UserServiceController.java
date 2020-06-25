package io.dowlath.userservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @Author Dowlath
 * @create 6/25/2020 9:04 PM
 */
@RestController
public class UserServiceController {

    @Autowired
    private RestTemplate template;

    @Autowired
    private DiscoveryClient client;


    @GetMapping("/accessAPI")
    public String invokeGreetingService(){
        URI uri = client.getInstances("Greeting-Service").stream().map(si -> si.getUri()).findFirst()
                .map(s -> s.resolve("/greeting")).get();
        return template.getForObject(uri,String.class);
    }

}
