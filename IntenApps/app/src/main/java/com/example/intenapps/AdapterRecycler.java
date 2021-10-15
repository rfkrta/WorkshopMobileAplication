package com.example.intenapps;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.VHolder> {

    ArrayList<PersonList> personLists;

    public AdapterRecycler(ArrayList<PersonList> personlist) {
        this.personLists = personlist;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false); //call/menguhungkan dgn list item xml
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder holder, int position) {
        //get data/value dari array personlist
        final PersonList person = personLists.get(position);

        //set image dari aray
        ImageView imagess = holder.imagess;

        imagess.setImageResource(personLists.get(position).getImagess());
        holder.txtNama.setText(person.getNama());
        holder.txtProdi.setText(String.valueOf(person.getProdi()));
        holder.txtSemester.setText(String.valueOf(person.getSemester()));

        //on click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(holder.itemView.getContext(), DetailPerson.class); //membuat intent/penghubung ke animedetail activity
                intent.putExtra("PERSON", person); //membuat kode untuk detail anime yang di tampilkan
                holder.itemView.getContext().startActivity(intent); //start new activity
            }
        });
    }

    @Override
    public int getItemCount() {
        return personLists.size();
    } //panjang array linkkist

    public class VHolder extends RecyclerView.ViewHolder{

        ImageView imagess;
        TextView txtNama;
        TextView txtProdi;
        TextView txtSemester; //deklarasi item dari list_item

        public VHolder(@NonNull View itemView){
            super(itemView);
            imagess = itemView.findViewById(R.id.img);
            txtNama = itemView.findViewById(R.id.nama);
            txtProdi = itemView.findViewById(R.id.prodi);
            txtSemester = itemView.findViewById(R.id.semester);



        }
    }
}
