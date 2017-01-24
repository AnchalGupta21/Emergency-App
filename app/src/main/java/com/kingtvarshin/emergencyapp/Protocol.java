package com.kingtvarshin.emergencyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.kingtvarshin.emergencyapp.Adapter.Credits_listAdapter;
import com.kingtvarshin.emergencyapp.Adapter.Protocol_listAdapter;

import java.util.ArrayList;

public class Protocol extends AppCompatActivity {

    String newString;
    ListView l;
    ArrayList<String> protocol;
    Button emergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocol);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("name");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("name");
        }

        emergency = (Button)findViewById(R.id.emergencybt);
        emergency.setText("Emergency");
        emergency.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        call(newString);
                    }
                }
        );

        protocol = new ArrayList<>();
        protocol.add("bla");

        if(newString.equals("fire"))
        {
            protocol = new ArrayList<>();
            protocol.add("1. Call the emergency number.");
            protocol.add("2. Activate the fire alarm.");
            protocol.add("3. Remain calm and evacuate the building.");
            protocol.add("4. If possible and safe, use the fire extinguisher.");
            protocol.add("5. Don't re-enter until cleared by the authorities");
        }
        else if (newString.equals("medical"))
        {
            protocol = new ArrayList<>();
            protocol.add("1. Call the emergency number.");
            protocol.add("2. Remain calm and follow directions from campus security.");
            protocol.add("3. For basic medical emergency ask for first aid.");
            protocol.add("4. In case of a serious emergency, directly contact the ambulance and then contact the campus security.");
        }
        else if (newString.equals("violent"))
        {
            protocol = new ArrayList<>();
            protocol.add("1. Call the emergency number.");
            protocol.add("2. Describe the nature,location and discription of the incident.");
            protocol.add("3. Follow directions.");
        }
        else if (newString.equals("lockdown"))
        {
            protocol = new ArrayList<>();
            protocol.add("1. Call the emergency number.");
            protocol.add("2. Follow directions from campus security.");
            protocol.add("3. Remain calm.");
            protocol.add("4. Try to attract attention.");
        }

        l = (ListView)findViewById(R.id.protocols);
        l.setAdapter(new Protocol_listAdapter(Protocol.this,protocol));
    }

    public void call(String name)
    {
        if(name.equals("medical"))
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","01596-51-5558", null)));
        else
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","+91-7023973480", null)));
    }


}
