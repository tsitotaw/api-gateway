package com.cs544.sample.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/commentServiceFallback")
    public String commentServiceFallbackMethod(){
        return "Comment Service is taking longer than expected. " +
                " Please try again later";
    }
    @GetMapping("/postServiceFallback")
    public String postServiceFallbackMethod(){
        return "Post Service is taking longer than expected. " +
                " Please try again later";
    }
}
