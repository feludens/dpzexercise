package com.dominos.dpzcodeexercise.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dominos.dpzcodeexercise.R;
import com.dominos.dpzcodeexercise.utils.PizzaLoader;
import com.dominos.dpzcodeexercise.adapters.PizzaAdapter;

import java.util.List;

/**
 * @author Pizza Guru
 * Created on 1/30/2018.
 */

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        List<String> testData = PizzaLoader.getTestData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        PizzaAdapter mAdapter = new PizzaAdapter(testData);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}
