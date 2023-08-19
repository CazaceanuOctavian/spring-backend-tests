package com.spring.backend.service;

import com.spring.backend.pojo.Show;

public interface ShowServiceInterface {
    public Show getShowByIndex(int index);
    public int getShowIndexById(String id);
    public int getShowListSize();
    public void addShow(Show show);
    public void updateShow(int index, Show show);
    public String getShowIdByIndex(int index);
}
