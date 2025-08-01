package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button bt_logout=findViewById(R.id.bt_logout);
        ImageView iv_home = findViewById(R.id.iv_home);
        ImageView iv_setting = findViewById(R.id.iv_settings);
        TextView tv_email = findViewById(R.id.tv_email);
        TextView user_name = findViewById(R.id.userName);
        ImageView profile_image = findViewById(R.id.profileImage);

        user_name.setText("Welcome back,");
        profile_image.setImageResource(R.drawable.hackers);

        SharedPreferences prefs = getSharedPreferences("MyEmail", MODE_PRIVATE);
        String email = prefs.getString("user_email", "no-email");
        tv_email.setText(email);

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_logout = new Intent(settings.this , login.class);
                startActivity(i_logout);
            }
        });
        iv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_home = new Intent(settings.this , MainActivity.class);
                startActivity(i_home);
            }
        });
        iv_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_setting = new Intent(settings.this , settings.class);
                startActivity(i_setting);
            }
        });

    }
}