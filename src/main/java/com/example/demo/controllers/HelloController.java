package com.example.demo.controllers;

import com.example.demo.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/hello")
public class HelloController {
    public HelloController(){

    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> hello(String name) {
        Response response = new Response(name);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
