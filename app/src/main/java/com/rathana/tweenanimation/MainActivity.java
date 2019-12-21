package com.rathana.tweenanimation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.AnimRes;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnFadeIn, btnFadeOut, btnRotate, btnZoomIn,btnMove,btnMixAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        btnFadeIn = findViewById(R.id.butFadeIn);
        btnFadeOut = findViewById(R.id.butFadeOut);
        btnRotate = findViewById(R.id.btnRotate);
        btnZoomIn = findViewById(R.id.btnZoomIn);
        btnMove = findViewById(R.id.btnMove);
        btnMixAnim = findViewById(R.id.btnMixAnim);

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(loadAnim(R.anim.anim_fade_in));
            }
        });

        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(loadAnim(R.anim.anim_fade_out));
            }
        });

        btnRotate.setOnClickListener(view -> {
            imageView.startAnimation(loadAnim(R.anim.anim_rotate));
        });

        btnZoomIn.setOnClickListener(v -> {
            imageView.startAnimation(loadAnim(R.anim.anim_scale));
        });

        btnMove.setOnClickListener(v-> imageView.startAnimation(loadAnim(R.anim.anim_traslate)));

        btnMixAnim.setOnClickListener(v->
                imageView.startAnimation(loadAnim(R.anim.anim_mix)));
    }

    private Animation loadAnim(@AnimRes int animRes) {
        return AnimationUtils.loadAnimation(this, animRes);
    }
}
