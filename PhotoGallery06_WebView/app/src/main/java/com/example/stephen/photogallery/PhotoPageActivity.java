package com.example.stephen.photogallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by stephen on 16-06-30.
 */
public class PhotoPageActivity extends AppCompatActivity {

    public static Intent newIntent(Context context, Uri photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);

        if(savedInstanceState == null) {
            getFragmentManager().
                    beginTransaction().
                    add(R.id.fragment_container, PhotoPageFragment.newInstance(getIntent().getData()), PhotoPageFragment.NAME).
                    commit();
        }

    }

}
