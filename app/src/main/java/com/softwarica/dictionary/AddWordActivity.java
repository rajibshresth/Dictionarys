package com.softwarica.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AddWordActivity extends AppCompatActivity {

    EditText etCountry, etCapital;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        etCountry = findViewById(R.id.etCountry);
        etCapital = findViewById(R.id.etCapital);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }
        });
    }

    private void Save(){

        try {
            PrintStream printStream = new PrintStream(openFileOutput("word.txt", MODE_PRIVATE | MODE_APPEND));
            printStream.println(etCountry.getText().toString() + "->" + etCapital.getText().toString());
            Toast.makeText(this, "Saved to" + getFilesDir(), Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            Log.d("Dictionary App", "Error"+ e.toString());
            e.printStackTrace();
        }

    }
}
