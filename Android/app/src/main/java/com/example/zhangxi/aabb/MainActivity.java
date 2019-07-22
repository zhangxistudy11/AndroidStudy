package com.example.zhangxi.aabb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置activity视图
        setContentView(R.layout.activity_main);

        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到TextView展示
                  Intent intent  =new Intent(MainActivity.this,TextViewActivity.class);
                  startActivity(intent);
            }
        });
    }
}
