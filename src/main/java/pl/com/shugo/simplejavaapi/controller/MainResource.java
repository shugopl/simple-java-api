package pl.com.shugo.simplejavaapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public interface MainResource {

    @GetMapping("/hello")
    ResponseEntity<String> hello();
}
