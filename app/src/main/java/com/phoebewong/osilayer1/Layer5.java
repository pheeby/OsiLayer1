package com.phoebewong.osilayer1;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.animation.ObjectAnimator;

public class Layer5 extends AppCompatActivity {

    ConstraintLayout mainLayout;
    ImageView turtle;
    ImageView sloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer5);

        mainLayout = (ConstraintLayout) findViewById(R.id.mainLayout);
        mainLayout.setOnClickListener(MyOnClickListener);
        turtle = (ImageView) findViewById(R.id.turtleImage);
        turtle.setOnClickListener(MyOnClickListener);
        sloth = (ImageView) findViewById(R.id.slothImage);
        sloth.setOnClickListener(MyOnClickListener);

    }

    OnClickListener MyOnClickListener = new OnClickListener(){

        @Override
        public void onClick(View v){
            flipIt(v);
        }
    };

    private void flipIt(final View viewToFlip){
        ObjectAnimator flip = ObjectAnimator.ofFloat(viewToFlip, "rotationY", 0f, 360f);
        flip.setDuration(500);
        flip.start();
    }

}
