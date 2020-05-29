package com.practice.image;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mList1;
    List<App> appList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList1 = findViewById(R.id.list1);
        appList = new ArrayList<>();

        appList.add(new App(R.drawable.youtube,"Youtube"));
        appList.add(new App(R.drawable.maxplayer,"Max Player"));
        appList.add(new App(R.drawable.messenger,"Messenger"));
        appList.add(new App(R.drawable.twitter,"Twitter"));
        appList.add(new App(R.drawable.vlc,"VLC Player"));
        appList.add(new App(R.drawable.whatsapp,"Whatsapp"));

        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);


        CustomAdaptor adaptor1 = new CustomAdaptor(this,appList);
        mList1.setAdapter(adaptor1);


    }
}
