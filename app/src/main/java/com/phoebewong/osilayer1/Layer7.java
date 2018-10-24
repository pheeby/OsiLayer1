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
    ImageView deoxys;
    ImageView snorlax;
    ImageView heart1;
    ImageView heart2;

    ScaleAnimation sato0 = new ScaleAnimation(1, 0, 1, 1,
            Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);
    ScaleAnimation sato1 = new ScaleAnimation(0, 1, 1, 1,
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
//        turtle.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (sloth.getVisibility() == View.VISIBLE) {
//                    sloth.startAnimation(sato0);
//                } else {
//                    turtle.startAnimation(sato0);
//                }
//            }
//        });
//
//        sloth.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (turtle.getVisibility() == View.VISIBLE) {
//                    turtle.startAnimation(sato0);
//                } else {
//                    sloth.startAnimation(sato0);
//                }
//            }
//        });
        turtle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sloth.getVisibility() == View.VISIBLE) {
                    sloth.startAnimation(sato0);
                } else {
                    turtle.startAnimation(sato0);
                }
            }
        });

        sloth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sloth.getVisibility() == View.VISIBLE) {
                    turtle.startAnimation(sato0);
                } else {
                    sloth.startAnimation(sato0);
                }
            }
        });

    }

    private void showTurtle() {
        turtle.setVisibility(View.VISIBLE);
        sloth.setVisibility(View.INVISIBLE);
    }

    private void showSloth() {
        turtle.setVisibility(View.INVISIBLE);
        sloth.setVisibility(View.VISIBLE);
    }

    private void initView() {
        turtle = (ImageView) findViewById(R.id.imageView2);
        sloth = (ImageView) findViewById(R.id.imageView3);
        showTurtle();
        sato0.setDuration(500);
        sato1.setDuration(500);

        sato0.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (turtle.getVisibility() == View.VISIBLE) {
                    turtle.setAnimation(null);
                    showSloth();
                    sloth.startAnimation(sato1);
                } else {
                    sloth.setAnimation(null);
                    showTurtle();
                    turtle.startAnimation(sato1);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });


//        initView1();
//        deoxys.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (deoxys.getVisibility() == View.VISIBLE) {
//                    deoxys.startAnimation(sato0);
//                } else {
//                    snorlax.startAnimation(sato0);
//                }
//            }
//        });
//        snorlax.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (deoxys.getVisibility() == View.VISIBLE) {
//                    deoxys.startAnimation(sato0);
//                } else {
//                    snorlax.startAnimation(sato0);
//                }
//            }
//        });
//
//    }
//        private void showDeoxys () {
//            deoxys.setVisibility(View.VISIBLE);
//            snorlax.setVisibility(View.INVISIBLE);
//        }
//
//        private void showSnorlax () {
//            deoxys.setVisibility(View.INVISIBLE);
//            snorlax.setVisibility(View.VISIBLE);
//        }
//
//        private void initView1 () {
//            deoxys = (ImageView) findViewById(R.id.imageView6);
//            snorlax = (ImageView) findViewById(R.id.imageView5);
//            showDeoxys();
//            sato0.setDuration(500);
//            sato1.setDuration(500);
//
//            sato0.setAnimationListener(new AnimationListener() {
//                @Override
//                public void onAnimationStart(Animation animation) {
//
//                }
//
//                @Override
//                public void onAnimationEnd(Animation animation) {
//                    if (deoxys.getVisibility() == View.VISIBLE) {
//                        deoxys.setAnimation(null);
//                        showSnorlax();
//                        snorlax.startAnimation(sato1);
//                    } else {
//                        snorlax.setAnimation(null);
//                        showDeoxys();
//                        deoxys.startAnimation(sato1);
//                    }
//                }
//
//                @Override
//                public void onAnimationRepeat(Animation animation) {
//
//                }
//            });
//
//
//            initView2();
//            heart1.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (heart1.getVisibility() == View.VISIBLE) {
//                        heart1.startAnimation(sato0);
//                    } else {
//                        heart2.startAnimation(sato0);
//                    }
//                }
//            });
//            heart2.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (heart1.getVisibility() == View.VISIBLE) {
//                        heart1.startAnimation(sato0);
//                    } else {
//                        heart2.startAnimation(sato0);
//                    }
//                }
//            });
//        }
//        private void showHeart1 () {
//            heart1.setVisibility(View.VISIBLE);
//            heart2.setVisibility(View.INVISIBLE);
//        }
//        private void showHeart2 () {
//            heart1.setVisibility(View.INVISIBLE);
//            heart2.setVisibility(View.VISIBLE);
//        }
//
//        private void initView2 () {
//            heart1 = (ImageView) findViewById(R.id.imageView7);
//            heart2 = (ImageView) findViewById(R.id.imageView8);
//            showHeart1();
//            sato0.setDuration(500);
//            sato1.setDuration(500);
//
//            sato0.setAnimationListener(new AnimationListener() {
//                @Override
//                public void onAnimationStart(Animation animation) {
//
//                }
//
//                @Override
//                public void onAnimationEnd(Animation animation) {
//                    if (heart1.getVisibility() == View.VISIBLE) {
//                        heart1.setAnimation(null);
//                        showHeart2();
//                        heart2.startAnimation(sato1);
//                    } else {
//                        heart2.setAnimation(null);
//                        showHeart1();
//                        heart1.startAnimation(sato1);
//                    }
//                }
//
//                @Override
//                public void onAnimationRepeat(Animation animation) {
//
//                }
//            });
//        }
    }
}




