package com.kingtvarshin.emergencyapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Complain_Suggestions extends AppCompatActivity {

    Drawable bits;
    Button complain;
    EditText complainet;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_suggestions);
        bits = getResources().getDrawable(R.drawable.bits);
        bits.setAlpha(100);

        complain =(Button)findViewById(R.id.complainsend);
        complainet =(EditText)findViewById(R.id.complain_et);

        text = complainet.getText().toString();


        complain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent emailintent1 = new Intent(Intent.ACTION_SEND);
                        emailintent1.putExtra(Intent.EXTRA_EMAIL, new String[] {"smac.bitspilani@gmail.com"});
                        emailintent1.putExtra(Intent.EXTRA_SUBJECT,"Complains_and_Suggestions_from_app");
                        emailintent1.putExtra(Intent.EXTRA_TEXT, text);
                        emailintent1.setType("message/rfc882");
                        startActivity(Intent.createChooser(emailintent1, "Email"));
                    }
                }
        );


    }
}
