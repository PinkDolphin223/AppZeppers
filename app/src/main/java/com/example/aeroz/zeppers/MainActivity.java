package com.example.aeroz.zeppers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    void myFunction(){
        int a = 5;
    }
    void otherFunction(){
        double a = 5.3;
    }
}
