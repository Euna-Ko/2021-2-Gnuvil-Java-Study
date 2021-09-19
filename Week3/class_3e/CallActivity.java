package com.gnuvil_practice_ko.class_3e;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        String message = getIntent().getStringExtra("intent-message");

        Toast.makeText(CallActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}