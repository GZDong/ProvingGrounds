package com.gzd.example.provinggrounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.gzd.example.provinggrounds.view.widget.TestView;

public class MainActivity extends AppCompatActivity {
    private TestView mTestView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTestView = findViewById(R.id.test_custom_view);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleanim);
        mTestView.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
        mTestView.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
        mTestView.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
        mTestView.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.set);
        mTestView.startAnimation(animation);
    }
}
