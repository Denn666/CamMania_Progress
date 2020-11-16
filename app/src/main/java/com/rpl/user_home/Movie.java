package com.rpl.user_home;

public class Movie {
    private String title;
    private String year;
    private String price;


    public Movie(String title, String year, String price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() { return price; }

    public void setPrice(String price) { this.price = price;}

}
