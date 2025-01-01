package pl.com.shugo.simplejavaapi.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import pl.com.shugo.simplejavaapi.controller.MainResource;

@Controller
public class MainControllerImpl implements MainResource {

    @Override
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
