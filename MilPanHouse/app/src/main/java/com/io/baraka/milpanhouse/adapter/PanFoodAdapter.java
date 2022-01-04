package com.io.baraka.milpanhouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.io.baraka.milpanhouse.R;
import com.io.baraka.milpanhouse.model.PanFood;
import com.io.baraka.milpanhouse.model.PopularFood;

import java.util.List;

public class PanFoodAdapter extends RecyclerView.Adapter<PanFoodAdapter.PanFoodViewHolder> {

    Context context;
    List<PanFood> panFoodList;

    public PanFoodAdapter(Context context, List<PanFood> panFoodList) {
        this.context = context;
        this.panFoodList = panFoodList;
    }

    @NonNull
    @Override
    public PanFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.pan_food_row_item, parent, false);
        return new PanFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PopularFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(panFoodList.get(position).getImgurl());
        holder.name.setText(panFoodList.get(position).getName());
        holder.price.setText(panFoodList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return panFoodList.size();
    }

    public static final class PanFoodViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView price,name;
        public PanFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
        }
    }

}
