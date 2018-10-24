package com.phoebewong.osilayer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Quiz7 extends AppCompatActivity {

    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonA = (Button) findViewById(R.id.buttonA);
                buttonA.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Quiz7.this, correctAnswer.class));
                    }
                });
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonB = (Button) findViewById(R.id.buttonB);
                buttonB.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Quiz7.this, incorrectAnswer.class));
                    }
                });
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonC = (Button) findViewById(R.id.buttonC);
                buttonC.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Quiz7.this, incorrectAnswer.class));
                    }
                });
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonD = (Button) findViewById(R.id.buttonD);
                buttonD.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Quiz7.this, incorrectAnswer.class));
                    }
                });
            }
        });


    }
}
