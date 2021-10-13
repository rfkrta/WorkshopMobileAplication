package com.example.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context myContext;
    List<Chat> myData;

    public RecyclerViewAdapter(Context myContext, List<Chat> myData) {
        this.myContext = myContext;
        this.myData = myData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(myContext).inflate(R.layout.item_chat,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;


    }
    //kelas yang akan dipakai untuk viewholder
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvNama.setText(myData.get(position).getNama());
        holder.tvNohp.setText(myData.get(position).getNo_hp());
        holder.images.setImageResource(myData.get(position).getPhotos());
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    //inisiasi untuk viewholder
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNama;
        private TextView tvNohp;
        private ImageView images;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = (TextView) itemView.findViewById(R.id.contact_name);
            tvNohp = (TextView) itemView.findViewById(R.id.phone_contact);
            images = (ImageView) itemView.findViewById(R.id.wasap);
        }
    }
}
