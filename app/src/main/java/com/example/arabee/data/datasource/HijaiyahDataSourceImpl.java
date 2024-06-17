package com.example.arabee.data.datasource;

import com.example.arabee.data.model.Hijaiyah;

import java.util.ArrayList;
import java.util.List;

public class HijaiyahDataSourceImpl implements HijaiyahDataSource {
    @Override
    public List<Hijaiyah> getHijaiyahList() {
        List<Hijaiyah> hijaiyahs = new ArrayList<>();

        hijaiyahs.add(new Hijaiyah(
                "1",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));

        hijaiyahs.add(new Hijaiyah(
                "2",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));
        hijaiyahs.add(new Hijaiyah(
                "1",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));
        hijaiyahs.add(new Hijaiyah(
                "1",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));
        hijaiyahs.add(new Hijaiyah(
                "1",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));
        hijaiyahs.add(new Hijaiyah(
                "1",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));
        hijaiyahs.add(new Hijaiyah(
                "1",
                "https://raw.githubusercontent.com/matchaicy/FinalProject-assets/main/img_alif.png"
        ));
        return hijaiyahs;
    }
}
