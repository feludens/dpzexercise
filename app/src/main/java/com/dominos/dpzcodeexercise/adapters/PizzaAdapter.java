package com.dominos.dpzcodeexercise.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dominos.dpzcodeexercise.R;

import java.util.List;

/**
 * @author Pizza Guru
 * Created on 1/30/2018.
 */

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.MyViewHolder> {

    private List<String> productNames;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView productName;

        public MyViewHolder(View view) {
            super(view);
            productName = view.findViewById(R.id.teest);
        }
    }

    public PizzaAdapter(List<String> productNames) {
        this.productNames = productNames;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_pizza, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String name = productNames.get(position);
        holder.productName.setText(name);
    }

    @Override
    public int getItemCount() {
        return productNames.size();
    }
}