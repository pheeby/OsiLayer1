package com.phoebewong.osilayer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                Toast.makeText(Quiz7.this, "correct!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Quiz7.this, "incorrect", Toast.LENGTH_SHORT).show();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Quiz7.this, "incorrect", Toast.LENGTH_SHORT).show();
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Quiz7.this, "incorrect", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
