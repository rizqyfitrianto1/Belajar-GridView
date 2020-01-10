package com.example.trainer.androidlatihan3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SampleDataListView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_listview2);
        ListView lv = findViewById(R.id.lv_sample2);
        List<String> data = new ArrayList<String>();
        data.add("Bandung");
        data.add("Jakarta");
        data.add("Surabaya");
        data.add("Depok");
        data.add("Bogor");

        ArrayAdapter<String> dataa = new ArrayAdapter<String>( this,
                android.R.layout.simple_list_item_1, data);

        lv.setAdapter(dataa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Bundle b = new Bundle();

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:{
                        b.putString("kota", "bdg");
                        Intent intent = new Intent(SampleDataListView.this, FromDataList.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 1:{
                        b.putString("kota", "jkt");
                        Intent intent = new Intent(SampleDataListView.this, FromDataList.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 2:{
                        b.putString("kota", "sby");
                        Intent intent = new Intent(SampleDataListView.this, FromDataList.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 3:{
                        b.putString("kota", "dpk");
                        Intent intent = new Intent(SampleDataListView.this, FromDataList.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 4:{
                        b.putString("kota", "bgr");
                        Intent intent = new Intent(SampleDataListView.this, FromDataList.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }
                }
//                if(position == 0) {
//                    Toast.makeText(getApplicationContext(), "Hai saya dari Bandung",
//                            Toast.LENGTH_SHORT).show();
//                }else if (position == 2){
//                    Toast.makeText(getApplicationContext(), "Hai saya dari Surabaya",
//                            Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(getApplicationContext(), "Hai saya list",
//                            Toast.LENGTH_SHORT).show();
//                }

            }
        });

        registerForContextMenu(lv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.context_list, menu);
    }
}

