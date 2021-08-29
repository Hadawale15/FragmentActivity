package com.example.fragmentactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1id);
        button2 = findViewById(R.id.button2id);
        button3=findViewById(R.id.button3id);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1id:
                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout1id,firstFragment);
                transaction.commit();
                break;

            case R.id.button2id:
                SecondFragment secondFragment=new SecondFragment();
                FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.layout1id,secondFragment);
                transaction1.commit();
                break;

            case R.id.button3id:
                ThirdFragment thirdFragment=new ThirdFragment();
                FragmentTransaction transaction2=getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.layout1id,thirdFragment);
                transaction2.commit();
                break;

        }
    }
}