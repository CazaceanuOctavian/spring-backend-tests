package com.spring.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.pojo.Show;
import com.spring.backend.constants.Constants;
import com.spring.backend.repository.ContactShowRepository;

@Service
public class ContactShowServiceImpl implements ContactShowService{
    
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
    public void removeShow(int index) {
        contactRepository.removeShow(index);
    }
  
    @Override
    public List<Show> getShows() {
        return contactRepository.getShows();
    }

    //TODO --> change to lambda expression
    @Override
    public int getShowIndexById(String id) {
        for(int i=0; i<getShowListSize(); i++) {
            if(getShowByIndex(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }
}
