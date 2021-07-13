package com.myfirst.notifyadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private ArrayList<Item> arrayList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        setData();
        setAdapter();
    }

    private void setAdapter() {
        itemAdapter = new ItemAdapter(this,arrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setAdapter(itemAdapter);
        mRecyclerView.setLayoutManager(gridLayoutManager);
    }

    private void setData() {
        arrayList.add(new Item("Books",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Podcasts",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("News",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Business",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Entertainment",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Sports",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Technology",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Pronunciation",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Grammar",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Health",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Books",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
        arrayList.add(new Item("Podcasts",getColor(R.color.blue),(getDrawable(R.drawable.itembg)),false));
    }

    @Override
    public void onClick(Boolean value, Item item, int position) {
        if(item.getBoolean()){
            item.setBackground((getDrawable(R.drawable.itembg)));
            item.setTextColor(getColor(R.color.blue));
            item.setBoolean(false);
            itemAdapter.notifyItemChanged(position);
        }
        else{
            item.setBackground((getDrawable(R.color.blue)));
            item.setTextColor(getColor(R.color.white));
            item.setBoolean(true);
            itemAdapter.notifyItemChanged(position);
        }
    }
}