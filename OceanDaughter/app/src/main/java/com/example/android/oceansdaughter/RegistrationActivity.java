package com.example.android.oceansdaughter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        Intent intent = getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
            String username = intent.getStringExtra(Intent.EXTRA_TEXT);
            EditText edittext = (EditText) findViewById(R.id.email);
            edittext.setText(username);

        }
        Button button = (Button) findViewById(R.id.submit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(RegistrationActivity.this, Registration.class);
                startActivity(regis);
            }
        });
    }
}