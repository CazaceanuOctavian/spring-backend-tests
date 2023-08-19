package com.spring.backend.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.backend.pojo.Show;

@Repository
public class ContactShowRepository {
    
    private List<Show> shows = new ArrayList<>();
      
    public List<Show> getShows() {
        return shows;
    }

    public Show getShowByIndex(int index) {
        return shows.get(index);
    }

    public int getShowListSize() {
        return shows.size();
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public void updateShow(int index, Show show) {
        shows.set(index, show);
    }

    public String getShowIdByIndex(int index) {
        return shows.get(index).getId();
    }
 
    
}
