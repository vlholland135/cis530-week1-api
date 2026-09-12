/*
Holland, V. (2026). CIS 530 Server-Side Development. Bellevue University.
*/
package com.holland.week11api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * REST controller for the Week 1 Spring Boot assignment.
 * Exposes two GET endpoints, one returning plain text and one returning
 * a JSON object built from a Map.
 */
@RestController
public class HelloController {

    /**
     * Returns a plain-text welcome message.
     * @return a String greeting the user and naming the course.
     */
    @GetMapping("/api/hello")
    public String hello() {
        return "Holland, Welcome to CIS-530 Course!";
    } // end of hello

    /**
     * Returns a JSON object containing basic course and technology
     * information.
     * @return a Map<String, Object> serialized to JSON by Spring Boot.
     */
    @GetMapping("/api/info")
    public Map<String, Object> info() {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("course", "CIS 530");
        data.put("week", 1);
        data.put("technology", "Spring Boot 4");
        return data;
    } // end of info

} // end of HelloController