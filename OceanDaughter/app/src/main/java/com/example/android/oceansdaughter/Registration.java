package com.example.android.oceansdaughter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static com.example.android.oceansdaughter.R.layout.create_a_class;
public class Registration extends AppCompatActivity {
    ArrayList<Student> student = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(create_a_class);

        Button button = (Button) findViewById(R.id.show_students);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studentIntent = new Intent(Registration.this, CreateClassActivity.class);
                startActivity(studentIntent);
            }
        });

        Button button2 = (Button) findViewById(R.id.done);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent studentIntent = new Intent(Registration.this, MainActivity.class);
//                startActivity(studentIntent);
            }
        });

    }
}

