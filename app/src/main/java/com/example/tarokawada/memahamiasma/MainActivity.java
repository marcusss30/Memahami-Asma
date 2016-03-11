package com.example.tarokawada.memahamiasma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void toEnglish (View view){
        startActivity(new Intent(this, EnglishActivity.class));
    }

    public void toMalay (View view){
        startActivity(new Intent(this, MalayActivity.class));
    }


}
