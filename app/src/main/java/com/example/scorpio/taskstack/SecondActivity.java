package com.example.scorpio.taskstack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("02activity被创建了。任务栈id："+getTaskId());
    }

    public void open01(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void open02(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        System.out.println("02activityonnew intent。任务栈id："+getTaskId());
        super.onNewIntent(intent);
    }
}
