package com.example.udacity_noah.funnyjokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke = getIntent().getStringExtra("joke");
        TextView jokeTextView = (TextView) findViewById(R.id.display_joke_textView);
        jokeTextView.setText(joke);

    }
}
