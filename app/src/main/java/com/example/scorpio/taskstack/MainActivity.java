package com.example.scorpio.taskstack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("01activity被创建了。任务栈id："+getTaskId());
    }
    
    public void open01(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void open02(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
