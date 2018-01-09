package com.iflytek.drip.abtestdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent对象
                Intent intent =new Intent();
                //指定intent要启动的类
                intent.setClass(MainActivity.this,OtherActivity.class);
                startActivity(intent);
                //关闭当前Activity
                finish();
            }
        });
    }
}
