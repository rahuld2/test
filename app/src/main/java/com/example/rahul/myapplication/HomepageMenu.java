package com.example.rahul.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomepageMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_menu);
        Button Map = (Button) findViewById(R.id.BtnMap);
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageMenu.this, Maps.class);
                startActivity(intent);
            }
        });
        Button Building = (Button) findViewById(R.id.BtnBuildings);
        Building.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageMenu.this, Buildings.class);
                startActivity(intent);

            }
        });
        Button Checklist = (Button) findViewById(R.id.BtnChecklist);
        Checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageMenu.this, Checklist.class);
                startActivity(intent);

            }
        });
        Button Events = (Button) findViewById(R.id.BtnEvents);
        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageMenu.this, Events.class);
                startActivity(intent);

            }
        });
        Button SocialMedia = (Button) findViewById(R.id.BtnSocialMedia);
        SocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageMenu.this, SocialMedia.class);
                startActivity(intent);

            }
        });

        Button Id = (Button) findViewById(R.id.BtnID);
        Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageMenu.this, YourID.class);
                startActivity(intent);

            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
