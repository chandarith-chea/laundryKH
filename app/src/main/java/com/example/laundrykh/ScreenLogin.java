package com.example.laundrykh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenLogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);
        String[] spinnerTitles;
        String[] spinnerPopulation;
        int[] spinnerImages;

        spinnerTitles = new String[]{"+855", "+93", "+86", "France", "Germany", "India", "Ireland", "Italy", "Mexico", "Poland"};
        spinnerPopulation = new String[]{"24.13 Million", "207.7 Million", "1.379 Billion", "66.9 Million", "82.67 Million", "1.324 Billion", "4.773 Million", "60.6 Million", "127.5 Million", "37.95 Million"};
        spinnerImages = new int[]{
                  R.drawable.flag_australia
                , R.drawable.flag_brazil
                , R.drawable.flag_china
                , R.drawable.flag_france
                , R.drawable.flag_germany
                , R.drawable.flag_india
                , R.drawable.flag_ireland
                , R.drawable.flag_italy
                , R.drawable.flag_maxico
                , R.drawable.flag_poland};
    }

}
