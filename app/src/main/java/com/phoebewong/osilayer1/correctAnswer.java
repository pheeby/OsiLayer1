package com.phoebewong.osilayer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class correctAnswer extends AppCompatActivity {

    Button videos;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);

        videos = (Button) findViewById(R.id.videoButton1);
        answer = (TextView) findViewById(R.id.correctText);

        answer.setText("Congrats, you got it right!" + "\n" + "\n" + "FEEDBACK");

        videos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(correctAnswer.this, videoList.class));
            }
        });


    }
}
