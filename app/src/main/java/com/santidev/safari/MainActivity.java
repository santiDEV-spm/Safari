package com.santidev.safari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Elephant e = new Elephant(15, 1200);
        e = (Elephant) feed(e);

        Animal a = new Elephant(15, 80);
        

    }

    Animal feed(Animal animalToBeFeed){
        return animalToBeFeed;
    }
}