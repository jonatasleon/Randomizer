package com.jonatasleon.randomizer.randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ivLeft = (ImageView) findViewById(R.id.ivLeft);
        final ImageView ivRight = (ImageView) findViewById(R.id.ivRight);

        final Button btnHitMe = (Button) findViewById(R.id.btnHitMe);
        assert btnHitMe != null;

        final Animation fadeOut = new FadeOutAnimation(1f, 0);
        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ivLeft.setVisibility(View.GONE);
                ivRight.setVisibility(View.GONE);
                btnHitMe.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i = r.nextInt(2);

                btnHitMe.setVisibility(View.GONE);
                if(i == 0) {
                    ivLeft.setVisibility(View.VISIBLE);
                    ivLeft.startAnimation(fadeOut);
                }else {
                    ivRight.setVisibility(View.VISIBLE);
                    ivRight.startAnimation(fadeOut);
                }
            }
        };

        btnHitMe.setOnClickListener(clickListener);
    }
}
