package com.fish95.gacha10;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActvity extends AppCompatActivity {
    TextView tv_intro_title;

    Button btn_intro_goto_main;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btn_intro_goto_main = (Button)findViewById(R.id.intro_btn_goto_main);

        //Loading();
        btn_intro_goto_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void sendVer() {
        //android app version check <<search
    }

   /* private void Loading() {
        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
               btnGotoMain.setEnabled(true);
            }
        };
        handler.sendEmptyMessageDelayed(0, 1000);
    }*/
}
