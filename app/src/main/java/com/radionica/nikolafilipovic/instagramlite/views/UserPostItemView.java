package com.radionica.nikolafilipovic.instagramlite.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.radionica.nikolafilipovic.instagramlite.R;
import com.radionica.nikolafilipovic.instagramlite.models.UserPost;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Nikola Filipović on 16.4.2016..
 */

@EViewGroup(R.layout.view_item_user_post)
public class UserPostItemView extends LinearLayout {

    @ViewById
    ImageView userImage;
    @ViewById
    TextView username;
    @ViewById
    ImageView image;
    @ViewById
    TextView description;

    public UserPostItemView(Context context) {

        super(context);
    }

    public void bind(UserPost userPost){

        userImage.setImageResource(userPost.getUser().getImageResId());
        username.setText(userPost.getUser().getName());
        image.setImageResource(userPost.getImageResId());
        description.setText(userPost.getDescription());
    }
}
