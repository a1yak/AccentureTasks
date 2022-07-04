package com.example.demo.Service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
@RestController
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplate= restTemplateBuilder.build();
    }
    @GetMapping("/info")
    public String getPostsPlainJson(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, String.class);
    }


    @GetMapping("/users")
    public Post[] getPostsAsObject() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, Post[].class);
    }

}
