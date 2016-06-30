package com.example.stephen.photogallery;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoGalleryActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);

        if(savedInstanceState == null) {
            getFragmentManager().
                    beginTransaction().
                    add(R.id.fragment_container, new PhotoGalleryFragment(), PhotoGalleryFragment.NAME).
                    commit();
        }

    }
}
