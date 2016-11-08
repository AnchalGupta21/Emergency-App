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

import java.util.ArrayList;

public class Credits extends AppCompatActivity {

    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";

    private ArrayList<String> name;
    private ArrayList<String> post;
    private ArrayList<String> number;
    private Context context;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();

        lv = (ListView)findViewById(R.id.lvcredits);

        name = new ArrayList<>();
        name.add("Vikrant Singh");
        name.add("Ashish Tiwari");
        name.add("Mr. Ranvir Singh Rathore");

        post = new ArrayList<>();
        post.add("Developer");
        post.add("Non Resident Warden");
        post.add("Hostel Superintendents");

        number = new ArrayList<>();
        number.add("+91-7240105044");
        number.add("+91-7877796312");
        number.add("+91-9694096474");

        lv.setAdapter(
                new Contactus_listAdapter(Credits.this,name,post,number)
        );

        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number.get(i), null)));
                    }
                }
        );
    }
}
