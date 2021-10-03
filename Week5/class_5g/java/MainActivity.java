package com.gnuvil_practice_ko.class_5g;
//Practice SharedPreference

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_USER_KEY = "1000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHello = (TextView) findViewById(R.id.tv_hello);

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        //getInt(key,default): default는 value가 없을 경우 채워줄 값을 넣음
        //가입자의 경우 default값인 -1이 나오고, 기존 유저의 경우 1이 나옴
        int firstUser = sharedPref.getInt(FIRST_USER_KEY,-1);

        if (firstUser == 1){
            //기존 유저
            //방법 1: 무조건 한국어
            //tvHello.setText("오늘도 감사합니다 고객님");

            //방법 2: 언어 설정에 따라 string.xml의 translation 파일이 실행
            tvHello.setText(getString(R.string.hello_user));
        }
        else if (firstUser == -1) {
            //최초 실행 유저
            //방법 1: 무조건 한국어
            //tvHello.setText("만나서 반갑습니다 고객님");

            //방법 2: 언어 설정에 따라 string.xml의 translation 파일이 실행
            tvHello.setText(getString(R.string.hello_first));


            saveUserIsNotFirst();
        }
    }
    private void saveUserIsNotFirst() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(FIRST_USER_KEY, 1);
        editor.commit();
    }
}