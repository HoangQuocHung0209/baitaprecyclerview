package com.example.baitaprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRcvFood;
    List<FoodModel> mlistFood;
    FoodAdapter mFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerViewFood);
        mlistFood = FoodModel.getMock();
        mRcvFood.setHasFixedSize(true);
        mFoodAdapter = new FoodAdapter(mlistFood,this);
        mRcvFood.setAdapter(mFoodAdapter);
    }
}