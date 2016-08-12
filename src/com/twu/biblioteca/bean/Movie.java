package com.twu.biblioteca.bean;

public class Movie {
    private int id;
    private String name;
    private String year;
    private String director;
    private String rate;

    public Movie(int id, String name, String year, String director, String rate) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
