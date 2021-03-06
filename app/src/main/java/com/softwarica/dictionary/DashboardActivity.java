package com.softwarica.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    Button btnOpen, btnDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnOpen = findViewById(R.id.btnOpen);
        btnDictionary = findViewById(R.id.btnDictionary);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

          Intent intent = new Intent(DashboardActivity.this, AddWordActivity.class);
          startActivity(intent);
            }
        });

        btnDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, CapitalActivity.class);
                startActivity(intent);
            }
        });
    }
}
