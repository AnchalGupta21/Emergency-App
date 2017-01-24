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

import com.kingtvarshin.emergencyapp.Adapter.Contactus_listAdapter;
import com.kingtvarshin.emergencyapp.Adapter.Credits_listAdapter;

import java.util.ArrayList;

public class Credits extends AppCompatActivity {

    private ArrayList<String> name2;
    private Context context;
    ListView lv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        lv2 = (ListView)findViewById(R.id.lvsmaccredits);


        name2 = new ArrayList<>();
        name2.add("\nAn initiative by Safety & Medical Advisory Council\n(SMAC)\n");
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
