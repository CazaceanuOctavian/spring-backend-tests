package com.spring.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Show getShow(@PathVariable int index) {
        return contactService.getShowByIndex(index);
    }
    
}
