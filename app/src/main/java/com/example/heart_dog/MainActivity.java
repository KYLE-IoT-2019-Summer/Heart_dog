package com.example.heart_dog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.btn_make);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent1 = new Intent(getApplicationContext(), SignUp.class);
                startActivity(intent1);

                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });

        Button button2 = (Button) findViewById(R.id.btn_forget);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View w) {
                Intent intent2 = new Intent(getApplicationContext(), ForgottenPassword.class);
                startActivity(intent2);

                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });
    }
}
