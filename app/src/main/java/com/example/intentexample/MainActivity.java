package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActicity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "이것은 버거입니다", Toast.LENGTH_SHORT).show();
                //이미지을 클릭하면 자막(토스트)이 나온다
            }
        });

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActicity.class);
                startActivity(intent); //엑티비티 이동
            }
        });


    }
}