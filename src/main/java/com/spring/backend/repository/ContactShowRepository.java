package com.spring.backend.repository;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.backend.pojo.Show;

@Repository
public class ContactShowRepository {
    
    private List<Show> shows = Arrays.asList(
        new Show("Attack on titan", "Hero", (float)9.9, "123"),
        new Show("Harry Potter", "Potions", (float)6.7, "456"),
        new Show("Ergo Proxy", "The final Proxy", (float)10, "789")
    );

    public List<Show> getShows() {
        return shows;
    }

    public Show getShowByIndex(int index) {
        return shows.get(index);
    }

    public int getShowListSize() {
        return shows.size();
    }
 
    
}
