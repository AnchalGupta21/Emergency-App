package com.kingtvarshin.emergencyapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Medc_Timings extends AppCompatActivity {

    Drawable bits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medc__timings);
        bits = getResources().getDrawable(R.drawable.bits);
        bits.setAlpha(100);
    }
}
