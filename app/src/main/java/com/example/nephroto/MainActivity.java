package com.example.nephroto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //Add multiuser features
        //Organ shipper: OS
            //OS_MainActivity
            //OS_AddOrganStats
            //OS_AddOrganPictures
            //OS_PushOrganDB
        // Transplant surgeon: TS
            //TS_MainActivity
            //TS_ViewModelStats

}
