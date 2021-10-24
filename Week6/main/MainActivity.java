package com.gnuvil_practice_ko.class_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gnuvil_practice_ko.class_6.model.PostItem;
import com.gnuvil_practice_ko.class_6.recyclerview.PostAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //클래스로 접근
        ArrayList<PostItem> listItem = new ArrayList<>();

        RecyclerView rvList = (RecyclerView) findViewById(R.id.rv_list);

        for (int i = 0; i < 30; i++) {

            PostItem item = new PostItem(true, 125,"army",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzwYtU_Jso9sIgQPvUKoVMK91sfA9X4Kg0lg&usqp=CAU",
                    "BUTTER!!");
            listItem.add(i,item);
        }

        PostAdapter adapter = new PostAdapter(this, listItem);
        rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvList.setAdapter(adapter);


    }
}