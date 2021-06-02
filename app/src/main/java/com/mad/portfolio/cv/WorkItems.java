package com.mad.portfolio.cv;

public class WorkItems {

    private String title;
    private String year;
    private String description;

    public WorkItems(String title, String description, String year) {
        this.title = title;
        this.description = description;
        this.year = year;
    }

    public WorkItems() {

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
