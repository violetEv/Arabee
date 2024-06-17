package com.example.arabee.presentation.Hijaiyah;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.arabee.R;
import com.example.arabee.data.datasource.HijaiyahDataSource;
import com.example.arabee.data.datasource.HijaiyahDataSourceImpl;
import com.example.arabee.data.model.Hijaiyah;

public class DetailMateriHijaiyah2 extends AppCompatActivity {
    CardView prev;
     HijaiyahDataSource dataSource = new HijaiyahDataSourceImpl();
     HijaiyahAdapter hijaiyahAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi_hijaiyah2);
        prev = (CardView) findViewById(R.id.cv_prev);
        setClickListeners();
        setupAdapter();
    }

    private void setupAdapter() {
        hijaiyahAdapter = new HijaiyahAdapter(AdapterLayoutMode.GRID, this::navigateToDetailHijaiyah3);
    }
    private void navigateToDetailHijaiyah3(Hijaiyah hijaiyah) {
        DetailMateriHijaiyah3.startActivity(this);
    }

    private void setClickListeners() {
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevPage();
            }
        });
    }

    private void prevPage() {
        Intent intent = new Intent(this, DetailMateriHijaiyah1.class);
        startActivity(intent);
    }
}