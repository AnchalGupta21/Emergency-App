package com.kingtvarshin.emergencyapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class Login extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private static final String TAG = "LOGIN";
    EditText etsignin;
    AutoCompleteTextView etemail;
    Button btlogin,btsignin;
    String email,pass;
    private FirebaseAuth.AuthStateListener mautlistner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etemail = (AutoCompleteTextView) findViewById(R.id.etemail);
        btlogin = (Button)findViewById(R.id.btlogin);
        btsignin = (Button)findViewById(R.id.btsignin);
        etsignin = (EditText)findViewById(R.id.etsignin);
        mAuth = FirebaseAuth.getInstance();

        // Get the string array
        String[] countries = getResources().getStringArray(R.array.pilani_email);
// Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        etemail.setAdapter(adapter);

        mautlistner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                if(firebaseAuth.getCurrentUser()!=null){
                    startActivity(new Intent(Login.this,MainActivity.class));
                }

            }
        };


        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = etemail.getText().toString();
                pass = "Abhudhay2921234567";
                if(email.toLowerCase().contains("@pilani.bits-pilani.ac.in"))
                {
                    Startsignup();
                }
                else
                {
                    Toast.makeText(Login.this, "enter bits ID",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        btsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = etsignin.getText().toString();
                pass = "Abhudhay2921234567";
                if(email.toLowerCase().contains("@pilani.bits-pilani.ac.in"))
                {
                    Startsignin();
                }
                else
                {
                    Toast.makeText(Login.this, "You r Not registered by this email id",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser!=null){
            startActivity(new Intent(Login.this,MainActivity.class));
        }
    }

    private void Startsignin() {

        mAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            startActivity(new Intent(Login.this,MainActivity.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(Login.this, "You are not registered. please register first",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });

    }

    public void Startsignup(){

        mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            startActivity(new Intent(Login.this,MainActivity.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                Toast.makeText(Login.this,
                                        "User with this email already exist. please sign in", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(Login.this, "Connection Error",
                                        Toast.LENGTH_SHORT).show();
                            }

                        }

                        // ...
                    }
                });
    }



}
