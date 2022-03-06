package com.example.demo.controllers;

import com.example.demo.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/hello")
public class HelloController {
    public HelloController(){

    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> hello(@RequestParam String name, HttpServletRequest request) {
        Response response = new Response();
        response.setGreating(name);
        response.setHostIp(request.getLocalAddr());
        response.setHostName(request.getLocalName());
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
