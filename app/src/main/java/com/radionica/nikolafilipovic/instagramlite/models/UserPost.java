package com.radionica.nikolafilipovic.instagramlite.models;

/**
 * Created by Nikola Filipović on 16.4.2016..
 */
public class UserPost {

    private User user;

    private String description;

    private int imageResId;

    public UserPost() {
    }

    public UserPost(User user, String description, int imageResId) {
        this.user = user;
        this.description = description;
        this.imageResId = imageResId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    @Override
    public String toString() {
        return "UserPost{" +
                "user=" + user +
                ", description='" + description + '\'' +
                ", imageResId=" + imageResId +
                '}';
    }
}
