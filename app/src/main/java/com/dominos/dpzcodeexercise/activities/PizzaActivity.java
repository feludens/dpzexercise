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

    //TODO 1 : Instead of the test products list, load the product data from 'products.json'
    //TODO 2 : Create a custom view to display the complete product information (Name, Image, Description)
    //TODO 3 : Update the PizzaAdapter to use your custom view
    //TODO 4 : Load the products list in the Activity, but display it on a Fragment
    //TODO 5 : Write logic to sort the list alphabetically
    //TODO 6 : Write a test for your sorting logic
}
