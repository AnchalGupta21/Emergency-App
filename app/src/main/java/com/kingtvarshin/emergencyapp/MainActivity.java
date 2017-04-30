package com.kingtvarshin.emergencyapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

//    Drawable bits;
    Button medicalcall,securitycall;
    Button importantcontact,complain,medctiming,emergencyprotoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bits = getResources().getDrawable(R.drawable.bits);
//        bits.setAlpha(100);

        securitycall = (Button)findViewById(R.id.bt_security);
        medicalcall = (Button)findViewById(R.id.bt_medical);
        importantcontact = (Button)findViewById(R.id.bt_importantcontact);
        complain = (Button)findViewById(R.id.bt_complainsuggestion);
        medctiming = (Button)findViewById(R.id.bt_medctiming);
        emergencyprotoc = (Button)findViewById(R.id.bt_emergencyprotocol);


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

        emergencyprotoc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this,Emergency_Protocol.class));
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

//                        Intent emailintent1 = new Intent(Intent.ACTION_SEND);
//                        emailintent1.putExtra(Intent.EXTRA_EMAIL, new String[] {"smac.bitspilani@gmail.com"});
//                        emailintent1.putExtra(Intent.EXTRA_SUBJECT,"Complains_and_Suggestions_from_app");
//
//                        emailintent1.setType("message/rfc882");
//                        startActivity(Intent.createChooser(emailintent1, "Email"));
                        //Open popup window
                        final AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                        View mview =getLayoutInflater().inflate(R.layout.activity_alert_girl,null);
                        mBuilder.setView(mview);
                        Button call = (Button)mview.findViewById(R.id.btproceed);
                        call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+91-7023973480", null)));
                            }
                        });
                        AlertDialog dialog =mBuilder.create();
                        dialog.show();
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
    public void onBackPressed() {
//        // Write your code here
////        startActivity(new Intent(MainActivity.this,MainActivity.class));
////        finish();
//        onStop();
//        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent);
//        finish();
//
////        super.onBackPressed();
        moveTaskToBack(true);
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
            Intent emailintent1 = new Intent(Intent.ACTION_SEND);
            emailintent1.putExtra(Intent.EXTRA_EMAIL, new String[] {"smac.bitspilani@gmail.com"});
            emailintent1.setType("message/rfc882");
            startActivity(Intent.createChooser(emailintent1, "Email"));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
