package com.radionica.nikolafilipovic.instagramlite.fragments;


import android.os.Bundle;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.radionica.nikolafilipovic.instagramlite.R;
import com.radionica.nikolafilipovic.instagramlite.adapters.UserPostAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */

@EFragment(R.layout.fragment_home)
public class HomeFragment extends Fragment {


    @ViewById
    ListView listView;

    @Bean
    UserPostAdapter userPostsAdapter;

    @ViewById
    ProgressBar progressBar;

    private int progress;

    @AfterViews
    @Background
    void makeProgress(){
        while(progress <= progressBar.getMax()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progress += 1;
            updateProgress();
        }
    }
    @UiThread
    void updateProgress(){
        progressBar.setProgress(progress);
    }
    @AfterViews
    @UiThread //(delay = 100)
    void setAdapter(){
        listView.setAdapter(userPostsAdapter);
    }

    //void init(){
      //  listView.setAdapter(userPostsAdapter);
    //}


}
