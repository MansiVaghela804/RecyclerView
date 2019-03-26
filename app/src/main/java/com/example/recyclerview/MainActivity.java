package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Models> modelsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelsList = new ArrayList<>();
        ModelsAdapter mAdapter = new ModelsAdapter(modelsList);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        Models models[] = {new Models(R.drawable.ic_android_black_24dp,"Android"),
                new Models(R.drawable.ic_star_black_24dp,"Rate"),
                new Models(R.drawable.ic_send_black_24dp,"Send"),
                new Models(R.drawable.ic_share_black_24dp,"Share")};

        for (int j=0;j<10;j++) {
            for (int i = 0; i < models.length; i++) {
                modelsList.add(models[i]);
            }
        }
        // 2. set layoutManger
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
// 3. create an adapter

// 4. set adapter
       recyclerView.setAdapter(mAdapter);
    }
}
