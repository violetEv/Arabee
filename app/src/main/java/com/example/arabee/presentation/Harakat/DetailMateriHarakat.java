package com.example.arabee.presentation.Harakat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.arabee.R;

public class DetailMateriHarakat extends AppCompatActivity {

    ImageView back;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_materi_harakat2);
        back = (ImageView) findViewById(R.id.iv_back);
        setupImageViewClick(R.id.iv_fathah, R.raw.fathah);
        setupImageViewClick(R.id.iv_kasrah, R.raw.kasrah);
        setupImageViewClick(R.id.iv_dhommah, R.raw.dhommah);
        setupImageViewClick(R.id.iv_fathahtanwin, R.raw.fathahtanwin);
        setupImageViewClick(R.id.iv_kasrahtanwin, R.raw.kasrahtanwin);
        setupImageViewClick(R.id.iv_dhommahtanwin, R.raw.dhommahtanwin);
        setupImageViewClick(R.id.iv_sukun, R.raw.sukun);
        setupImageViewClick(R.id.iv_tasydid, R.raw.tasydid);
    }
    private void setupImageViewClick(int imageViewId, int soundResourceId) {
        ImageView imageView = findViewById(imageViewId);
        imageView.setOnClickListener(v -> playSound(soundResourceId));
    }

    private void playSound(int soundResourceId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundResourceId);
        mediaPlayer.start();
    }

    private void setClickListener() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHome();
            }
        });

    }

    private void navigateToHome() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        navController.navigate(R.id.navigation_home);
    }
    @Override
    protected void onDestroy() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}