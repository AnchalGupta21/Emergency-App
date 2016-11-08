package com.kingtvarshin.emergencyapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Drawable bits;
    Button medicalcall,securitycall;
    Button importantcontact,complain,medctiming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bits = getResources().getDrawable(R.drawable.bits);
        bits.setAlpha(100);

        securitycall = (Button)findViewById(R.id.bt_security);
        medicalcall = (Button)findViewById(R.id.bt_medical);
        importantcontact = (Button)findViewById(R.id.bt_importantcontact);
        complain = (Button)findViewById(R.id.bt_complainsuggestion);
        medctiming = (Button)findViewById(R.id.bt_medctiming);


        securitycall.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+91-7023973480", null)));
                    }
                }
        );

        medicalcall.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01596515558", null)));
                    }
                }
        );

        importantcontact.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this,Important_Contacts.class));
                    }
                }
        );

        complain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this,Complain_Suggestions.class));
                    }
                }
        );

        medctiming.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this,Medc_Timings.class));
                    }
                }
        );





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_credits) {
            startActivity(new Intent(MainActivity.this,Credits.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
