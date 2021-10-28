package com.gnuvil_practice_ko.bts_glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView ivBts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBts = (ImageView) findViewById(R.id.iv_bts);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startLoadingBtsImage();
            }

        });
    }

    private void startLoadingBtsImage() {
        String url = "https://pbs.twimg.com/media/E_xQnJaVQAM0eOg?format=jpg&name=900x900";

        Glide.with(this).load(url).into(ivBts);
    }
}