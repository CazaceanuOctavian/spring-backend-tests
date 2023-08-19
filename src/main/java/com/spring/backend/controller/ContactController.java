package com.spring.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.constants.Constants;
import com.spring.backend.pojo.Show;
import com.spring.backend.service.ContactShowService;

@RestController
public class ContactController {
    
    @Autowired
    private ContactShowService contactService;

    @GetMapping("/show/getByIndex/{index}")
    public ResponseEntity<Show> getShowUsingIndex(@PathVariable(required = true) int index) {
        if(index > contactService.getShowListSize()-1 || index < 0)
            return new ResponseEntity<Show>(HttpStatus.BAD_REQUEST);

        Show currentShow = contactService.getShowByIndex(index);
        return new ResponseEntity<Show>(currentShow, HttpStatus.OK);
    }

    @GetMapping("/show/getById/{id}")
    public ResponseEntity<Show> getShowUsingId(@PathVariable(required = true) String id) {
        int currentShowIndex = contactService.getShowIndexById(id);
        if(currentShowIndex == Constants.NOT_FOUND)
            return new ResponseEntity<Show>(HttpStatus.BAD_REQUEST);

        Show currentShow = contactService.getShowByIndex(currentShowIndex);
        return new ResponseEntity<Show>(currentShow, HttpStatus.OK);
    }

    @PostMapping("/show")
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        contactService.addShow(show);
        return new ResponseEntity<Show>(show, HttpStatus.CREATED);
    }

    @PutMapping("/show/updateById/{id}")
    public ResponseEntity<Show> updateShowById(@PathVariable(required = true) String id, @RequestBody Show show) {
        int currentShowIndex = contactService.getShowIndexById(id);
        if(currentShowIndex == Constants.NOT_FOUND)
            return new ResponseEntity<Show>(HttpStatus.BAD_REQUEST);
        
        show.setId(id);
        contactService.updateShow(currentShowIndex, show);
        return new ResponseEntity<Show>(show, HttpStatus.OK);
    }
    
    @PutMapping("/show/updateByIndex/{index}")
    public ResponseEntity<Show> updateShowByIndex(@PathVariable(required = true) int index, @RequestBody Show show) {
         if(index > contactService.getShowListSize()-1 || index < 0)
            return new ResponseEntity<Show>(HttpStatus.BAD_REQUEST);
        
        show.setId(contactService.getShowIdByIndex(index));
        contactService.updateShow(index, show);
        return new ResponseEntity<Show>(show, HttpStatus.OK);

    }
}
