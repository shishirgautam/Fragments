package com.dashboard.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dashboard.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
    private Button btCalculate;
    private EditText etFirstNo,etSecondNo;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //binding
        etFirstNo = view.findViewById(R.id.etFirst);
        etSecondNo = view.findViewById(R.id.etSecond);
        btCalculate = view.findViewById(R.id.btnCal);
        btCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first =Integer.parseInt(etFirstNo.getText().toString());
        int second = Integer.parseInt(etSecondNo.getText().toString());
        int result= first+second;
        Toast.makeText(getActivity(), "Sum is :" +result , Toast.LENGTH_SHORT).show();


    }
}
