package com.IconMaster;


import android.annotation.SuppressLint;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.com.IconMaster.R;

import android.widget.CompoundButton;
import android.widget.Switch;
@SuppressLint("MissingPermission")
public class MainActivity extends AppCompatActivity {

    private Switch serviceSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceSwitch = findViewById(R.id.service_switch);

        serviceSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // 启动服务的代码
                } else {
                    // 停止服务的代码
                }
            }
        });
    }
}

