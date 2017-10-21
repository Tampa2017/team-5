package com.example.android.oceansdaughter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import recycleview_topics.RecycleViewTopicsActivity;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText email;
    private EditText password;
    private Button signIN;
    private Button register;

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        signIN = (Button) findViewById(R.id.sign_in);
        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(this);
        signIN.setOnClickListener(this);
    }

    public void registerUser() {
        String email_ = email.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if (TextUtils.isEmpty(email_)) {
            // email is empty
            Toast.makeText(this, "Please enter Email.", Toast.LENGTH_SHORT).show();
            // stop function execution further
            return;
        }
        if (TextUtils.isEmpty(pass)) {
            // pass is empty
            Toast.makeText(this, "Please enter Password.", Toast.LENGTH_SHORT).show();
            // stop function execution further
            return;
        }

        // if validations are OK


        firebaseAuth.createUserWithEmailAndPassword(email_, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // user registered
                    // start profile activity here
                    Toast.makeText(LoginActivity.this, "Registered Successfully", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Could not registered, try again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onClick(View view) {

        if (view == register) {
            registerUser();
        }
        if (view == signIN) {
            //sign in user
            String email_ = email.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if (TextUtils.isEmpty(email_)) {
                // email is empty
                Toast.makeText(this, "Please enter Email.", Toast.LENGTH_SHORT).show();
                // stop function execution further
                return;
            }
            if (TextUtils.isEmpty(pass)) {
                // pass is empty
                Toast.makeText(this, "Please enter Password.", Toast.LENGTH_SHORT).show();
                // stop function execution further
                return;
            }

            firebaseAuth.signInWithEmailAndPassword(email_, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        // successful login
                        // start profile activity here

                        Intent intent = new Intent(LoginActivity.this, RecycleViewTopicsActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "Could not Login", Toast.LENGTH_LONG).show();
                    }
                }
            });

        }

    }
}