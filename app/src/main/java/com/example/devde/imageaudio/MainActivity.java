package com.example.devde.imageaudio;

import android.media.MediaPlayer;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();
    int[] Img_res = {R.drawable.baboon,R.drawable.camel,R.drawable.cheetah,R.drawable.dog,R.drawable.jaguar,R.drawable.wolf};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 0;
        for( int name : Img_res)
        {
            Dataprovider dataprovider = new Dataprovider(name);
            arrayList.add(dataprovider);
            i++;
        }
        recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2, LinearLayoutManager.VERTICAL,false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new RecyclerAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);

    }
}
