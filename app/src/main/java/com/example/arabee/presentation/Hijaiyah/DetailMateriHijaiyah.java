package com.example.arabee.presentation.Hijaiyah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.arabee.R;

public class DetailMateriHijaiyah extends AppCompatActivity {

    ImageView back;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_detail_materi_hijaiyah2);
        back = (ImageView) findViewById(R.id.iv_back);

        setupImageViewClick(R.id.iv_alif, R.raw.alif);
        setupImageViewClick(R.id.iv_ba, R.raw.ba);
        setupImageViewClick(R.id.iv_ta, R.raw.ta);
        setupImageViewClick(R.id.iv_tsa, R.raw.tsa);
        setupImageViewClick(R.id.iv_jim, R.raw.jim);
        setupImageViewClick(R.id.iv_kha, R.raw.kha);
        setupImageViewClick(R.id.iv_kho, R.raw.kho);
        setupImageViewClick(R.id.iv_dal, R.raw.dal);
        setupImageViewClick(R.id.iv_dzal, R.raw.dzal);
        setupImageViewClick(R.id.iv_ro, R.raw.ro);
        setupImageViewClick(R.id.iv_zai, R.raw.zai);
        setupImageViewClick(R.id.iv_sin, R.raw.sin);
        setupImageViewClick(R.id.iv_syin, R.raw.syin);
        setupImageViewClick(R.id.iv_shod, R.raw.shod);
        setupImageViewClick(R.id.iv_dhod, R.raw.dhod);
        setupImageViewClick(R.id.iv_tho, R.raw.tho);
        setupImageViewClick(R.id.iv_dhlo, R.raw.dhlo);
        setupImageViewClick(R.id.iv_ain, R.raw.ain);
        setupImageViewClick(R.id.iv_ghoin, R.raw.ghoin);
        setupImageViewClick(R.id.iv_fa, R.raw.fa);
        setupImageViewClick(R.id.iv_qof, R.raw.qof);
        setupImageViewClick(R.id.iv_kaf, R.raw.kaf);
        setupImageViewClick(R.id.iv_lam, R.raw.lam);
        setupImageViewClick(R.id.iv_mim, R.raw.mim);
        setupImageViewClick(R.id.iv_nun, R.raw.nun);
        setupImageViewClick(R.id.iv_wau, R.raw.wau);
        setupImageViewClick(R.id.iv_ha, R.raw.ha);
        setupImageViewClick(R.id.iv_lamalif, R.raw.lamalif);
        setupImageViewClick(R.id.iv_hamzah, R.raw.hamzah);
        setupImageViewClick(R.id.iv_ya, R.raw.ya);
        setClickListeners();
    }

    private void playSound(int soundResourceId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundResourceId);
        mediaPlayer.start();
    }
    private void setupImageViewClick(int imageViewId, int soundResourceId) {
        ImageView imageView = findViewById(imageViewId);
        imageView.setOnClickListener(v -> playSound(soundResourceId));
    }

    private void setClickListeners() {
        back.setOnClickListener(v -> navigateToHome());

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
