package com.example.arabee.presentation.Hijaiyah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.arabee.R;

public class DetailMateriHijaiyah2 extends AppCompatActivity {
    CardView prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi_hijaiyah2);
        prev = (CardView) findViewById(R.id.cv_prev);
        setClickListeners();
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