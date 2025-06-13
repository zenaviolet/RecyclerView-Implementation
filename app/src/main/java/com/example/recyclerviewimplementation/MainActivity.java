package com.example.recyclerviewimplementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final RecyclerView recyclerView;
    public MyAdapter mAdapter;
    private final String[] myDataset = {"Apple", "Banana", "Orange", "Grape", "Strawberry", "Mango", "Pineapple", "Kiwi", "Blueberry", "Raspberry", "Lemon", "Lime", "Cherry", "Peach", "Plum"};

    public MainActivity(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }

}