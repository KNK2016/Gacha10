package com.fish95.gacha10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv_main_count;
    TextView tv_main_point;

    Button btn_main_setting;
    Button btn_main_SSR;
    Button btn_main_SR;
    Button btn_main_R;
    Button btn_main_goto_gacha;
    Button btn_main_goto_focus;
    Button btn_main_goto_list;


    @Override
    public void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_main_count = (TextView)findViewById(R.id.main_tv_count);
        tv_main_point = (TextView)findViewById(R.id.main_tv_point);

        btn_main_setting = (Button)findViewById(R.id.main_btn_setting);
        btn_main_SSR = (Button)findViewById(R.id.main_btn_ssr);
        btn_main_SR = (Button)findViewById(R.id.main_btn_sr);
        btn_main_R = (Button)findViewById(R.id.main_btn_r);
        btn_main_goto_gacha = (Button)findViewById(R.id.main_btn_goto_gacha);
        btn_main_goto_focus = (Button)findViewById(R.id.main_btn_goto_focus);
        btn_main_goto_list = (Button)findViewById(R.id.main_btn_goto_list);

        btn_main_goto_gacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GachaActivity.class);
                startActivity(intent);
            }
        });

        btn_main_goto_focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FocusCoinActivity.class);
                startActivity(intent);
            }
        });

        btn_main_goto_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CardListActivity.class);
                startActivity(intent);
            }
        });

    }
}
