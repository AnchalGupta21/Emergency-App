package com.kingtvarshin.emergencyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Emergency_Protocol extends AppCompatActivity{

    Button fire,medical,violent,lockdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_protocol);

        fire = (Button)findViewById(R.id.fire_protocol);
        medical = (Button)findViewById(R.id.medical_protocol);
        violent = (Button)findViewById(R.id.violent_protocol);
        lockdown = (Button)findViewById(R.id.lockdown_protocol);

        fire.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Protocol("fire");
                    }
                }
        );
        medical.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Protocol("medical");
                    }
                }
        );
        violent.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Protocol("violent");
                    }
                }
        );
        lockdown.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Protocol("lockdown");
                    }
                }
        );
    }

    public void Protocol(String name)
    {
        Intent in = new Intent(this,Protocol.class);
        in.putExtra("name",name);
        startActivity(in);
    }


}
