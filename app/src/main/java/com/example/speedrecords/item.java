package com.example.speedrecords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        TextView result = findViewById(R.id.full_name_text_view);
        TextView data = findViewById(R.id.birth_date_text_view);
        ImageView im = findViewById(R.id.image_view);
    }
}