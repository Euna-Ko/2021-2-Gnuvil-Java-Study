package com.gnuvil_practice_ko.class_4g;
//Practice View Event

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);

        findViewById(R.id.iv_photo).setOnClickListener(this);
        findViewById(R.id.iv_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.iv_like:
                Toast.makeText(MainActivity.this, "I love BTS!!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_share:
                Toast.makeText(MainActivity.this, "TOGETHER BTS!!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_photo:
                Toast.makeText(MainActivity.this, "Click BTS!!!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent){
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN: //손가락이 닿았을 때
                Toast.makeText(MainActivity.this, "TOUCH DOWN BTS!!!", Toast.LENGTH_SHORT).show();
                break;

            case MotionEvent.ACTION_UP: //손가락이 떨어졌을 때
                Toast.makeText(MainActivity.this, "TOUCH UP BTS!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        return false; //OnTouch가 더 상위의 것이기 때문에 touch와 click을 같이 사용할 때는 false, touch만 사용할 때는 true

    }
}