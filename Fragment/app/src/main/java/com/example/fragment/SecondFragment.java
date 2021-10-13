package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
//class fragment ke 2
public class SecondFragment extends Fragment {

    View view;
    Button SecondButton ;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate the layout for this fragment
        view = inflater.inflate(R.layout.secondfragment_act, container, false);
        //get the reference  of Button
        SecondButton = view.findViewById(R.id.secondButton);
        //perform setOnClickListener on secondButton
        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display a massage by using a Toast
                Toast.makeText(getActivity(),"Second Fragment", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
