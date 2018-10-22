package com.phoebewong.osilayer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Button;

public class Layer7 extends AppCompatActivity {
    ImageView turtle;
    ImageView sloth;
    Button quizButton;

        ScaleAnimation sato0 = new ScaleAnimation(1,0,1,1,
                Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);
        ScaleAnimation sato1 = new ScaleAnimation(0,1,1,1,
                Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer7);

        quizButton = (Button) findViewById(R.id.quizButton7);
        quizButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            startActivity(new Intent(Layer7.this, Quiz7.class));
        }
        });

        initView();
        findViewById(R.id.root).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
            if (turtle.getVisibility() == View.VISIBLE){
            turtle.startAnimation(sato0);
                }else{
                    sloth.startAnimation(sato0);
                }
            }
        });
    }
    private void showTurtle(){
        turtle.setVisibility(View.VISIBLE);
        sloth.setVisibility(View.INVISIBLE);
    }
    private void showSloth(){
        turtle.setVisibility(View.VISIBLE);
        sloth.setVisibility(View.INVISIBLE);
    }

    private void initView(){
        turtle = (ImageView) findViewById(R.id.imageView2);
        sloth = (ImageView) findViewById(R.id.imageView3);
        showTurtle();
        sato0.setDuration(500);
        sato1.setDuration(1000);

        sato0.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if(turtle.getVisibility() == View.VISIBLE){
                    turtle.setAnimation(null);
                    showSloth();
                    sloth.startAnimation(sato1);
                }else{
                    sloth.setAnimation(null);
                    showTurtle();
                    turtle.startAnimation(sato1);
                }

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
