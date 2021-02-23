package com.dashboard.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dashboard.fragments.fragments.FirstFragment;
import com.dashboard.fragments.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnpush;

    //if status is true then load first fragement
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnpush=findViewById(R.id.btnpush);
        btnpush.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status){

            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.Linearlayout,firstFragment);
            fragmentTransaction.addToBackStack(null); //backstep
            fragmentTransaction.commit();
            btnpush.setText("Load Second Fragment");
            status=false;
        }
        else {

            SecondFragment secondFragment  = new SecondFragment();
            fragmentTransaction.replace(R.id.Linearlayout,secondFragment);
            fragmentTransaction.addToBackStack(null); //backstep
            fragmentTransaction.commit();
            btnpush.setText("Load First Fragment");
            status=true;
        }

    }
}


