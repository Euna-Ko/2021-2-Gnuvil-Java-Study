package com.gnuvil_practice_ko.class_5b_5c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnColorButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_right, firstFragment).commit();
    }

    //Color
    //0: first color, 1: second color, 2: third color
    @Override
    public void onColorClick(int color) {

        Fragment fragment = null;

        switch (color) {
            case 0:
                fragment = new FirstFragment();
                break;

            case 1:
                fragment = new SecondFragment();
                break;

            case 2:
                fragment = new ThirdFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_right, fragment).commit();

    }
}