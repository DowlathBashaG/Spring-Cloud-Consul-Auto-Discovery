package io.dowlath.greetingservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Dowlath
 * @create 6/25/2020 2:33 PM
 */

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String getMessage(){
        return "Welcome to java world...!!!";
    }

}
