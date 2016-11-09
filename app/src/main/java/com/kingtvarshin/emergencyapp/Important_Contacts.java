package com.kingtvarshin.emergencyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.kingtvarshin.emergencyapp.Adapter.Contactus_listAdapter;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class Important_Contacts extends AppCompatActivity {

    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";

    Drawable bits;
    private ArrayList<String> name;
    private ArrayList<String> post;
    private ArrayList<String> number;
    private Context context;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_contacts);
        bits = getResources().getDrawable(R.drawable.bits);
        bits.setAlpha(100);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();

        lv = (ListView)findViewById(R.id.list_importantcontacts);

        String[] SPINNERLIST = {"AK", "BD", "BG", "CVR","GN","KR","ML","MR","RM","RP","SK","SR","VK","VY"};


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                findViewById(R.id.android_material_design_spinner);
        materialDesignSpinner.setAdapter(arrayAdapter);

        materialDesignSpinner.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i)
                        {
                            case 0:
                            {
                                name = new ArrayList<>();
                                name.add("Rajesh Prasad Mishra");
                                name.add("Harikrishnan Gopinadhan");
                                name.add("Mr. Kailash Nath Duggal");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096450");
                                number.add("01596242182");
                                number.add("+91-9694096466");

                                Adaptersetup();
                            }
                            break;
                            case 1:
                            {
                                name = new ArrayList<>();
                                name.add("J S Rathore");
                                name.add("Mr. Samunder Singh");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096472");
                                number.add("+91-9694096473");

                                Adaptersetup();
                            }
                            break;
                            case 2:
                            {
                                name = new ArrayList<>();
                                name.add("S N Patel");
                                name.add("Murali Palla");
                                name.add("Mr. Rohitashwa Singh Rathore");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694196400");
                                number.add("+91-9571028863");
                                number.add("+91-9694096465");

                                Adaptersetup();
                            }
                            break;
                            case 3:
                            {
                                name = new ArrayList<>();
                                name.add("Paritosh Shukla");
                                name.add("Paul Atish Tulsiram");
                                name.add("Mr. Kailash Nath Duggal");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9441569515");
                                number.add("+91-9649202109");
                                number.add("+91-9694096466");

                                Adaptersetup();
                            }
                            break;
                            case 4:
                            {
                                name = new ArrayList<>();
                                name.add("Dr. Nitin Chaturvedi");
                                name.add("Dr. Shrinivas Kota");
                                name.add("Mr. Sanjay Kumar Tomar");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096452");
                                number.add("+91-9414935853");
                                number.add("+91-9694096485");

                                Adaptersetup();
                            }
                            break;
                            case 5:
                            {
                                name = new ArrayList<>();
                                name.add("Nitin chaturvedi");
                                name.add("Devendra Kumar");
                                name.add("Mr. Sanjay Kumar Tomar");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096452");
                                number.add("+91-9413487072");
                                number.add("+91-9694096485");

                                Adaptersetup();
                            }
                            break;
                            case 6:
                            {
                                name = new ArrayList<>();
                                name.add("Sachin U Belgamwar");
                                name.add("Biswanath Layek");
                                name.add("Mr. Mahavir Singh");
                                name.add("Dipendu Bhunia");
                                name.add("Shamik Chakraborty");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");
                                post.add("Warden : Mal D");
                                post.add("Non Resident Warden : Mal D");

                                number = new ArrayList<>();
                                number.add("+91-9694096460");
                                number.add("+91-9929191466");
                                number.add("+91-9694096464");
                                number.add("+91-9694096490");
                                number.add("+91-9414080443");

                                Adaptersetup();
                            }
                            break;
                            case 7:
                            {
                                name = new ArrayList<>();
                                name.add("Surekha Bhanot");
                                name.add("Kusum Lata");
                                name.add("Sailaja Nandigama");
                                name.add("Ms. Ritu");
                                name.add("Ms. Mallika Upadhyay");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096461");
                                number.add("+91-9694096462");
                                number.add("+91-8890078534");
                                number.add("+91-9694096468");
                                number.add("+91-9694096469");

                                Adaptersetup();
                            }
                            break;
                            case 8:
                            {
                                name = new ArrayList<>();
                                name.add("Dipendu Bhunia");
                                name.add("Shamik Chakraborty");
                                name.add("Mr. Harbans Lal Chouhan");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096490");
                                number.add("+91-9414080443");
                                number.add("+91-9785644053");

                                Adaptersetup();
                            }
                            break;
                            case 9:
                            {
                                name = new ArrayList<>();
                                name.add("R. Raghunathan");
                                name.add("Prabhat N Jha");
                                name.add("Mr. Kailash Nath Duggal");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9694096453");
                                number.add("+91-9983629726");
                                number.add("+91-9694096466");

                                Adaptersetup();
                            }
                            break;
                            case 10:
                            {
                                name = new ArrayList<>();
                                name.add("Arun Jalan");
                                name.add("Bibhas Ranjan Sarkar");
                                name.add("Mr. Ranvir Singh Rathore");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9414082757");
                                number.add("+91-9549876464");
                                number.add("+91-9694096474");

                                Adaptersetup();
                            }
                            break;
                            case 11:
                            {
                                name = new ArrayList<>();
                                name.add("V.S. Shekhawat");
                                name.add("Rajdeep Chowdhury");
                                name.add("Mr. Rohitashwa Singh Rathore");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-9414082754");
                                number.add("+91-9680364105");
                                number.add("+91-9694096465");

                                Adaptersetup();
                            }
                            break;
                            case 12:
                            {
                                name = new ArrayList<>();
                                name.add("J S Rathore");
                                name.add("Srinivas Kota");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");

                                number = new ArrayList<>();
                                number.add("+91-9441569515");
                                number.add("+91-9772184441");

                                Adaptersetup();
                            }
                            break;
                            case 13:
                            {
                                name = new ArrayList<>();
                                name.add("Sunil Kumar Dubey");
                                name.add("Ashish Tiwari");
                                name.add("Mr. Ranvir Singh Rathore");

                                post = new ArrayList<>();
                                post.add("Warden");
                                post.add("Non Resident Warden");
                                post.add("Hostel Superintendents");

                                number = new ArrayList<>();
                                number.add("+91-8239703734");
                                number.add("+91-7877796312");
                                number.add("+91-9694096474");

                                Adaptersetup();
                            }
                            break;
                        }
                    }
                }
        );





    }



    public void Adaptersetup()

    {

        lv.setAdapter(
                new Contactus_listAdapter(Important_Contacts.this,name,post,number)
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
