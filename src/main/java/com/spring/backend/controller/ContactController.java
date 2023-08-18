package com.spring.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.pojo.Show;
import com.spring.backend.service.ContactShowService;

@RestController
public class ContactController {
    
    @Autowired
    private ContactShowService contactService;

    @GetMapping("/show/{index}")
    public ResponseEntity<Show> getShow(@PathVariable(required = true) int index) {
        if(index > contactService.getShowListSize()-1)
            return new ResponseEntity<Show>(HttpStatus.BAD_REQUEST);

        Show currentShow = contactService.getShowByIndex(index);
        return new ResponseEntity<Show>(currentShow, HttpStatus.OK);
    }
    
}
