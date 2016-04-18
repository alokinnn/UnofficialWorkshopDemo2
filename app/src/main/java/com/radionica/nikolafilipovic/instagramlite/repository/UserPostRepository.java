package com.radionica.nikolafilipovic.instagramlite.repository;

import com.radionica.nikolafilipovic.instagramlite.R;
import com.radionica.nikolafilipovic.instagramlite.models.User;
import com.radionica.nikolafilipovic.instagramlite.models.UserPost;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikola Filipović on 16.4.2016..
 */

@EBean
public class UserPostRepository {

    private List<UserPost> userPosts;

    @AfterInject
    void mockData(){

        userPosts = new ArrayList<>();
        final User user = new User("Nikola", R.drawable.nikola);

        for (int i = 0; i<10; i++){

            userPosts.add(new UserPost(user, "Workshop in progress!", R.drawable.rektorat));
        }
    }

    public List<UserPost> getUserPosts(){
        return userPosts;
    }
}
