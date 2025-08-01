package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView iv_home=findViewById(R.id.iv_home);
        ImageView iv_search=findViewById(R.id.iv_search);
        ImageView iv_fav=findViewById(R.id.iv_fav);
        ImageView iv_settings=findViewById(R.id.iv_settings);
        ImageView im_1 = findViewById(R.id.im_1);
        ImageView im_2 = findViewById(R.id.im_2);
        ImageView im_3 = findViewById(R.id.im_3);
        ImageView im_4 = findViewById(R.id.im_4);
        iv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        iv_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , settings.class);
                startActivity(i);
            }
        });
        im_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_im1 = new Intent(MainActivity.this , detail.class);
                startActivity(i_im1);
            }
        });
        im_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_im2 = new Intent(MainActivity.this , detail.class);
                startActivity(i_im2);
            }
        });
        im_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_im3 = new Intent(MainActivity.this , detail.class);
                startActivity(i_im3);
            }
        });
        im_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_im4 = new Intent(MainActivity.this , detail.class);
                startActivity(i_im4);
            }
        });
    }
}