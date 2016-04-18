package com.radionica.nikolafilipovic.instagramlite.models;

/**
 * Created by Nikola Filipović on 16.4.2016..
 */
public class User {

    private String name;

    private int imageResId;

    public User() {
    }

    public User(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", imageResId=" + imageResId +
                '}';
    }
}
