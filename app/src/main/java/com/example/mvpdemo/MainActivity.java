package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvpdemo.R;
import com.example.mvpdemo.loginview.LoginMVPDemoActivity;
import com.example.mvpdemo.views.GoogleMVPDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void googleMVPDemo(View v){
        startActivity(new Intent(this, GoogleMVPDemoActivity.class));
    }

    public void loginMVPDemo(View v){
        startActivity(new Intent(this, LoginMVPDemoActivity.class));
    }


}
