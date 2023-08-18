package com.spring.backend.pojo;

import java.util.UUID;

public class Show {

    private String title;
    private String episode;
    private Float rating;
    private String id;

    public Show() {
        this.id= UUID.randomUUID().toString();
    }

    public Show(String title, String episode, Float rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public Float getRating() {
        return this.rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

}
