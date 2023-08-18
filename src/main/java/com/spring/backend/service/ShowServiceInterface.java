package com.spring.backend.service;

import com.spring.backend.pojo.Show;

public interface ShowServiceInterface {
    public Show getShowByIndex(int index);
    public int getShowIndexById(String id);
    public int getShowListSize();
}
