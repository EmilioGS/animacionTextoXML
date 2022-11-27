package com.example.animacionestexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.txt2);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animaciones);
        animacion.setFillAfter(false);
        animacion.setRepeatMode(Animation.RESTART);
        animacion.setRepeatCount(1);
        tv.startAnimation(animacion);
    }
}