package com.example.android.oceansdaughter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }
    public void bysize(View view){
        TextView textView = (TextView) findViewById(R.id.answer);
        textView.setText(""+"Correct! Sharks determine social rank by sizing each other up. The larger shark is usually the dominant one.");

    }

    public void byspeed(View view)
    {
        TextView textView = (TextView) findViewById(R.id.answer);
        textView.setText(""+"Incorrect! The Correct answer is: by comparing size\nSharks determine social rank by sizing each other up. The larger shark is usually the dominant one.");
    }
    public void porbeagle(View view){
        TextView textView = (TextView) findViewById(R.id.answer1);
        textView.setText(""+"Correct! Porbeagle sharks may be one of the few playful fish species, seeming to play with floating objects and playing chase. Great whites may also play, but this behavior hasn't been seen in whale sharks… yet!");

    }

    public void whale(View view)
    {
        TextView textView = (TextView) findViewById(R.id.answer1);
        textView.setText(""+"Incorrect! The Correct answer is: Porbeagle Size\nPorbeagle sharks may be one of the few playful fish species, seeming to play with floating objects and playing chase. Great whites may also play, but this behavior hasn't been seen in whale sharks… yet!");
    }
}



