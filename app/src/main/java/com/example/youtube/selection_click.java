package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selection_click extends AppCompatActivity {
    CardView customInput,userInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_click);
        customInput = (CardView)findViewById(R.id.customInput);
        userInput = (CardView)findViewById(R.id.userInput);
        customInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        userInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),write_text.class);
                startActivity(intent);
            }
        });// bc bc bc maderchod laudu
    }
}
