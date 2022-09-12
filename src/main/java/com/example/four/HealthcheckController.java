package com.example.four;

import org.springframework.web.bind.annotation.*;

@RestController
class HealthcheckController {

    // Your solution

    @GetMapping(value = "/healthcheck")
    public void healthcheck() {
    }

    @PutMapping(value = "/healthcheck")
    public void healthcheckPut() {
    }

    @PostMapping(value = "/healthcheck")
    public void healthcheckPost() {
    }


    @DeleteMapping(value = "/healthcheck")
    public void healthcheckDelete() {
    }

}

