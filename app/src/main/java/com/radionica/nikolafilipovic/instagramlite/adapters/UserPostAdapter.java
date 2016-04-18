package com.radionica.nikolafilipovic.instagramlite.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.radionica.nikolafilipovic.instagramlite.models.UserPost;
import com.radionica.nikolafilipovic.instagramlite.repository.UserPostRepository;
import com.radionica.nikolafilipovic.instagramlite.views.UserPostItemView;
import com.radionica.nikolafilipovic.instagramlite.views.UserPostItemView_;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by Nikola Filipović on 16.4.2016..
 */
@EBean
public class UserPostAdapter extends BaseAdapter{

    @RootContext
    Context context;

    @Bean
    UserPostRepository userPostRepository;

    @Override
    public int getCount() {
        return userPostRepository.getUserPosts().size();
    }

    @Override
    public Object getItem(int position) {
        return userPostRepository.getUserPosts().get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        UserPostItemView userPostItemView;
        if (convertView == null) {
            userPostItemView = UserPostItemView_.build(context);
        } else {
            userPostItemView = (UserPostItemView) convertView;
        }

        userPostItemView.bind((UserPost) getItem(position));

        return userPostItemView;
    }
}
