package com.example.baitaprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
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
        mlistFood = new ArrayList<>();
        mlistFood.addAll(FoodModel.getMock());
        mRcvFood.setHasFixedSize(true);
        mFoodAdapter = new FoodAdapter(mlistFood,this);
        mRcvFood.setAdapter(mFoodAdapter);

        mFoodAdapter.bindOnItemFoodClickListener(new OnItemFoodClickListener() {
            @Override
            public void onClick(int position) {
//              Toast.makeText(MainActivity.this, "Xóa"+ mlistFood.get(position).getName(), Toast.LENGTH_SHORT).show();
                mlistFood.remove(position);
                mFoodAdapter.notifyItemRemoved(position);
            }
        });
    }
}