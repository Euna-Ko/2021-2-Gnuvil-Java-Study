package com.gnuvil_practice_ko.class_3e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_call);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(this, "Click!!", Toast.LENGTH_SHORT).show();
        //위, 아래 모두 기능은 같음: 버튼을 누르면 "Click"이라는 짧은 메세지 창이 보임
        //Toast.makeText(MainActivity.this, "Click!!", Toast.LENGTH_SHORT).show();

        /* 암시적 intent
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);
         */

        //명시적 intent
        Intent intent = new Intent(MainActivity.this, CallActivity.class);
        intent.putExtra("intent-message","game joa joa");
        startActivity(intent); //실행

    }
}