package com.example.trainer.androidlatihan3.ForRecyclerSample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.trainer.androidlatihan3.R;

import java.util.ArrayList;
import java.util.List;

public class SampleDataRecycle extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_main);
        ListView lv = findViewById(R.id.rcview);
        List<String> data = new ArrayList<String>();
        data.add("Mad Max");
        data.add("Inside Out");
        data.add("Star Wars: Episode VII");
        data.add("Shaun the Sheep");
        data.add("The Martian");
    }
}
