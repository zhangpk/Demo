package com.example.zpk.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    protected <T extends View> T getFind(int i) {
        return (T) findViewById(i);
    }

Button start,end;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        start = getFind(R.id.start);
        end = getFind(R.id.end);
        final Intent intent = new Intent();
        intent.setAction("com.zhang.pk");
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);


            }
        });

    }


}





















