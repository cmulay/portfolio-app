package com.mad.portfolio.testimonials;

public class TestimonialItems {

    private String name;
    private String desc;

    private String post;
    private int img;

    public TestimonialItems(String name, String desc, int img, String post) {
        this.name = name;
        this.desc = desc;
        this.img = img;
        this.post = post;
    }

    public TestimonialItems() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
