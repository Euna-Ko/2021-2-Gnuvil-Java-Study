package com.gnuvil_practice_ko.asynccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tv_display);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startAsyncCalc();
            }

        });
    }
    private void startAsyncCalc() {
        AsyncCalcTask task = new AsyncCalcTask();
        task.execute(1, Integer.MAX_VALUE); //콤마 대신 언더바로 자릿수 나타냄

    }
    //<넣을 값, 중간 과정, 결과 값>
    class AsyncCalcTask extends AsyncTask<Integer, Integer, Integer> {

        /** UI Thread */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /** Async Thread Method */
        @Override
        protected Integer doInBackground(Integer... integers) {

            int number = integers[0];
            int count = integers[1];
            int result = 0;

            int percentUnit = count / 100;

            for(int i = 0; i < count; i++){
                result += number;

                if (result % percentUnit == 0){
                    // 정수 퍼센트
                    publishProgress(result/percentUnit);
                }
            }
            return result;
        }

        /** UI Thread */
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //디스플레이에 보임
            tvDisplay.setText(values[0] + "%");

            //Logcat에 보임
            Log.d("AsyncCalcTask", values[0] + "%");

        }

        /** UI Thread */
        @Override //계산한 결과가 integer로 나오도록
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);

            tvDisplay.setText("Result: " + integer);
        }
    }
}