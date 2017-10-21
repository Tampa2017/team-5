package com.example.android.oceansdaughter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CreateClassActivity extends AppCompatActivity {


    ArrayList<Student> student = new ArrayList<>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.showclass);
        Registration test = new Registration();
        student.add(new Student("Name: Veronica Canido ","Grade: 2nd","Class: 1"));
        student.add(new Student("Name: Quoc Le","Grade: 3rd","Class: 1"));
        student.add(new Student("Name: Chaz ","Grade: 4th","Class: 2"));
        student.add(new Student("Name: David ","Grade: 2nd","Class: 1"));
        student.add(new Student("Name: Jose ","Grade: 3nd","Class: 3"));
        student.add(new Student("Name: Ernesto ","Grade: 2nd","Class: 1"));

        StudentAddapter adapter = new StudentAddapter(this, student);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
