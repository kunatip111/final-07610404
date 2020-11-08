package com.example.speedrecords;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class add extends AppCompatActivity {
    EditText dis;
    EditText tim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button add = findViewById(R.id.button_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dis = findViewById(R.id.editText_distance);
                tim = findViewById(R.id.editText_duration);

                String disS = dis.getText().toString().trim();
                String timS = tim.getText().toString().trim();

                cal c = new cal(disS,timS);

            }
        });
    }
}