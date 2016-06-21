package com.example.stephen.photogallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoGalleryActivity extends AppCompatActivity {

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
