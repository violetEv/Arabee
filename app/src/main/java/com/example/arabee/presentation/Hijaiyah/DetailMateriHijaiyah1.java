package com.example.arabee.presentation.Hijaiyah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.arabee.R;

public class DetailMateriHijaiyah1 extends AppCompatActivity {
    ImageView back;
    CardView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi_hijaiyah1);
        back = (ImageView) findViewById(R.id.ic_back);
        next = (CardView) findViewById(R.id.cv_next);

        setClickListeners();
    }

    private void setClickListeners() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHome();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
    }

    private void nextPage() {
        Intent intent = new Intent(this, DetailMateriHijaiyah2.class);
        startActivity(intent);
    }

    private void navigateToHome() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        navController.navigate(R.id.navigation_home);
    }
}