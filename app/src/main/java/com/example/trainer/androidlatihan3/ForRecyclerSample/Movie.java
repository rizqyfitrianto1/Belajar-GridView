package com.example.trainer.androidlatihan3.ForRecyclerSample;

public class Movie {
    private String title, genre, year;

    public Movie() {
    }

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {return title; }

    public void setTitle(String nama) { this.title = nama; }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }
}
