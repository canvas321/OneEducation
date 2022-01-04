package com.io.baraka.milpanhouse.model;

public class PopularFood {

    String name;
    String price;
    Integer imgurl;

    public PopularFood(String name, String price, Integer imgurl) {
        this.name = name;
        this.price = price;
        this.imgurl = imgurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImgurl() {
        return imgurl;
    }

    public void setImgurl(Integer imgurl) {
        this.imgurl = imgurl;
    }
}
