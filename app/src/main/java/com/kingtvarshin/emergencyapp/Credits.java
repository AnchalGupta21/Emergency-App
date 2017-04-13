package com.kingtvarshin.emergencyapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.kingtvarshin.emergencyapp.Adapter.Contactus_listAdapter;
import com.kingtvarshin.emergencyapp.Adapter.Credits_listAdapter;

import java.util.ArrayList;

public class Credits extends AppCompatActivity {

    private ArrayList<String> name2;
    private Context context;
    private GoogleApiClient mGoogleApiClient;
    Button btlogout;
    ListView lv2;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        lv2 = (ListView)findViewById(R.id.lvsmaccredits);
        btlogout = (Button)findViewById(R.id.btlogout);
        mAuth = FirebaseAuth.getInstance();

        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(getApplicationContext())
                .enableAutoManage(this, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

                        Toast.makeText(Credits.this,"connection error",Toast.LENGTH_SHORT).show();

                    }
                })
                .addApi(Auth.GOOGLE_SIGN_IN_API,gso)
                .build();

        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAuth.signOut();
                // Google sign out
                Auth.GoogleSignInApi.signOut(mGoogleApiClient);
                Intent i = new Intent(Credits.this, Login.class);
                startActivity(i);
            }
        });


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

    private void updateUI(Object o) {
    }



    private void adaptersetup() {
        lv2.setAdapter(
                new Credits_listAdapter(Credits.this,name2)
        );
    }

}
