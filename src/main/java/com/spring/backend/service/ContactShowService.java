package com.spring.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.pojo.Show;
import com.spring.backend.repository.ContactShowRepository;

@Service
public class ContactShowService implements ShowServiceInterface{
    
    @Autowired
    private ContactShowRepository contactRepository;

    @Override
    public Show getShowByIndex(int index) {
        return contactRepository.getShowByIndex(index);
    }
    

}
