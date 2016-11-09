package com.kingtvarshin.emergencyapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.kingtvarshin.emergencyapp.Adapter.Contactus_listAdapter;
import com.kingtvarshin.emergencyapp.Adapter.Credits_listAdapter;

import java.util.ArrayList;

public class Credits extends AppCompatActivity {

    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";

    private ArrayList<String> name2;
    private Context context;
    ListView lv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        lv2 = (ListView)findViewById(R.id.lvsmaccredits);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();

        name2 = new ArrayList<>();
        name2.add("Bikram Singh Bisth");
        name2.add("Harshita Goel");
        name2.add("Manan Singhal");
        name2.add("Reetika Srivastava");
        name2.add("Rishab Gupta");
        name2.add("Samarth Shah");
        name2.add("Abhyuday Sharma");
        name2.add("Raunaq Arora");
        name2.add("Saikrishna Kondameedi");
        name2.add("Vishal Surana");
        name2.add("Akshina Jindal");
        name2.add("Ankush Kumar");
        name2.add("Bhavana Narapareddy");
        name2.add("Kislaya Kumar");
        name2.add("Praneetha Chavana");
        name2.add("Soham Ranade");
        name2.add("Saman Singh");
        name2.add("\nDeveloper");
        name2.add("Vikrant Singh\n");

        adaptersetup();
    }

    private void adaptersetup() {
        lv2.setAdapter(
                new Credits_listAdapter(Credits.this,name2)
        );
    }

}
