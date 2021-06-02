package com.mad.portfolio.edu;

public class EduItems {
    private String title;
    private String description;
    private String year;

    public EduItems(String title, String description, String year) {
        this.title = title;
        this.year = year;
        this.description = description;
    }

    public EduItems() {

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
