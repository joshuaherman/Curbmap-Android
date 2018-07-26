package com.curbmap.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            CameraFragment cameraFragment = CameraFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.my_nav_host_fragment, cameraFragment)
                    .commitNow();
        }
    }

}
