package com.spring.backend.service;

import java.util.List;

import com.spring.backend.pojo.Show;

public interface ContactShowService {
    public List<Show> getShows();
    public Show getShowByIndex(int index);
    public int getShowIndexById(String id);
    public int getShowListSize();
    public void addShow(Show show);
    public void updateShow(int index, Show show);
    public String getShowIdByIndex(int index);
    public void removeShow(int index);
}
