package com.gnuvil_practice_ko.class_5b_5c;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {

    private OnColorButtonListener onColorButtonListener;

    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    // context == activity라고 생각
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        //implements 이후 형변환을 통해 onColorButtonListener을 콜백으로 가져올 수 있음
        onColorButtonListener = (OnColorButtonListener) context;


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_left, container, false);
        view.findViewById(R.id.v_first).setOnClickListener(this);
        view.findViewById(R.id.v_second).setOnClickListener(this);
        view.findViewById(R.id.v_third).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.v_first:
                onColorButtonListener.onColorClick(0);
                break;

            case R.id.v_second:
                onColorButtonListener.onColorClick(1);
                break;

            case R.id.v_third:
                onColorButtonListener.onColorClick(2);
                break;
        }
    }
}