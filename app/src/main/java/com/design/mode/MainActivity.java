package com.design.mode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new JianZao.Builder()
                .setGradle("测试--")
                .setHaha("哈哈66")
                .setMomey("233")
                .print()
                .build();

    }
}
