package com.aglenpol.simpleloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity9 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        button = (Button) findViewById(R.id.wstecz);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wstecz();
            }
        });
    }
    public void wstecz() {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }

}