package com.example.baitaprecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<FoodModel> listFoods;
    private Context context;
    private OnItemFoodClickListener onItemFoodClickListener;

    public FoodAdapter(List<FoodModel> listFoods, Context context) {
        this.listFoods = listFoods;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view =layoutInflater.inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.bind(listFoods.get(position));
    }

    @Override
    public int getItemCount() {
        if (listFoods == null || listFoods.size() == 0 ){
            return 0;
        }
        return listFoods.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
            ImageView img;
            TextView tvName,tvAddress,tvBusinessType,tvDistance,tvTime,tvDiscount;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.imageViewFood);
            tvName = itemView.findViewById(R.id.textViewName);
            tvAddress = itemView.findViewById(R.id.textViewAddress);
            tvBusinessType = itemView.findViewById(R.id.textViewType);
            tvDistance = itemView.findViewById(R.id.textViewDistance);
            tvTime = itemView.findViewById(R.id.textViewTime);
            tvDiscount = itemView.findViewById(R.id.textViewDiscount);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(context, listFoods.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                    if(onItemFoodClickListener != null){
                        onItemFoodClickListener.onClick(getAdapterPosition());
                    }
                }
            });
        }

        public void bind(FoodModel foodModel){
            img.setImageResource(foodModel.getImage());
            tvName.setText(foodModel.getName());
            tvAddress.setText(foodModel.getAddress());
            tvBusinessType.setText(foodModel.getBusinessType().toString());
            tvTime.setText(foodModel.getTime().toString());
            tvDistance.setText(" - Gi???m :"+foodModel.getDiscount()+" %");
            tvDistance.setText(">"+foodModel.getDistance()+" km");
        }

    }
        public void bindOnItemFoodClickListener(OnItemFoodClickListener onItemFoodClickListener){
            this.onItemFoodClickListener = onItemFoodClickListener;
        }
}
