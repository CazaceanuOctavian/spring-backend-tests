package com.spring.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.pojo.Show;
import com.spring.backend.constants.Constants;
import com.spring.backend.repository.ContactShowRepository;

@Service
public class ContactShowService implements ShowServiceInterface{
    
    @Autowired
    private ContactShowRepository contactRepository;

    @Override
    public Show getShowByIndex(int index) {
        return contactRepository.getShowByIndex(index);
    }

    @Override
    public int getShowListSize() {
        return contactRepository.getShowListSize();
    }

      @Override
    public String getShowIdByIndex(int index) {
        return contactRepository.getShowIdByIndex(index);
    }

     @Override
    public void addShow(Show show) {
        contactRepository.addShow(show);
    }

    @Override
    public void updateShow(int index, Show show) {
        contactRepository.updateShow(index, show);
    }
  
    @Override
    public int getShowIndexById(String id) {
        for(int i=0; i<getShowListSize(); i++) {
            if(getShowByIndex(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }

    

   
    

}
