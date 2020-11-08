package com.example.speedrecords;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    private Context mContext;
    private data[] mData;

    public adapter(Context context , data[] data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        data d = mData[position];


        holder.fullNameTextView.setText(d.result);
        holder.birthDateTextView.setText(d.distance);
        holder.birthDateTextView2.setText(d.time);

        holder.genderImageView.setImageResource(
                d.isMore == true ? R.drawable.red_cow : null
        );
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView fullNameTextView;
        TextView birthDateTextView;
        TextView birthDateTextView2;
        ImageView genderImageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.fullNameTextView = itemView.findViewById(R.id.full_name_text_view);
            this.birthDateTextView = itemView.findViewById(R.id.birth_date_text_view);
            this.genderImageView = itemView.findViewById(R.id.image_view);
            this.birthDateTextView2 = itemView.findViewById(R.id.birth_date_text_view2);

        }
    }
}
