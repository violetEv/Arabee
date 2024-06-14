package com.example.arabee.presentation.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arabee.R;
import com.example.arabee.presentation.Harakat.DetailMateriHarakat1;
import com.example.arabee.presentation.Hijaiyah.DetailMateriHijaiyah1;

public class HomeFragment extends Fragment {

    CardView hijaiyah, harakat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
         hijaiyah = view.findViewById(R.id.cv_hijaiyah);
         harakat = view.findViewById(R.id.cv_harakat);

         setClickListener();
         return  view;
    }

    private void setClickListener() {
        hijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailHijaiyah();
            }
        });
        harakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailHarakat();
            }
        });

    }

    private void navigateToDetailHarakat() {
        Intent intent = new Intent(requireActivity(), DetailMateriHarakat1.class);
        startActivity(intent);
    }

    private void navigateToDetailHijaiyah() {
        Intent intent = new Intent(requireActivity(), DetailMateriHijaiyah1.class);
        startActivity(intent);

    }
}