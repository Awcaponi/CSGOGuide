package com.android.awni.csgoguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void GotoLogInscreen(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void GoToMaps(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


    //public void GoToWeapons(View view) {
      //  Intent intent = new Intent(this, WeaponsActivity.class);
        //startActivity(intent);
    //}

    //public void GoToNews(View view) {
     //   Intent intent = new Intent(this, NewsActivity.class);
      //  startActivity(intent);
    //}
    }