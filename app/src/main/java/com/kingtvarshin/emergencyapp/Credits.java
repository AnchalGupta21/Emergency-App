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
    ListView lv2;
//    Button btlogout;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        lv2 = (ListView)findViewById(R.id.lvsmaccredits);
//        btlogout = (Button)findViewById(R.id.btlogout);


        name2 = new ArrayList<>();
        name2.add("\nDeveloper");
        name2.add("Vikrant Singh\n");

        adaptersetup();

//        btlogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut();
//                startActivity(new Intent(Credits.this,Login.class));
//            }
//        });
    }


    private void adaptersetup() {
        lv2.setAdapter(
                new Credits_listAdapter(Credits.this,name2)
        );
    }

}
