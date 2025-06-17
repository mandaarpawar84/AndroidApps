package com.example.adapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Adapter View
        mylistview = findViewById(R.id.mylistview);

        //2. Data source
        String[] countries = {"USA", "Germany", "India", "Vietnam", "Norway"};

        //3. Adapter view - using ArrayAdapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this, android.R.layout.simple_list_item_1,
//                countries);

        //3. Using CustomAdapter
        MyCustomAdapter adapter = new MyCustomAdapter(this, countries);

        //Connecting adapter to the view.
        mylistview.setAdapter(adapter);
    }
}