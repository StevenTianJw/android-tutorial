package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.button);
        final Button btn2 = findViewById(R.id.button2);
        final EditText ET1 = findViewById(R.id.editText2);
        img = findViewById(R.id.profile);
        img.setVisibility(View.INVISIBLE);
        final String password = "12345678";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ET1.getText().toString().equals(password)){
                    img.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.VISIBLE);

                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                img.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.INVISIBLE);
            }
        });
    }
}
