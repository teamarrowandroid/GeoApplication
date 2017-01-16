package com.example.harpreetsingh.geoapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Button login,logout;FloatingActionButton f;EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f=(FloatingActionButton)findViewById(R.id.floatingActionButton);

        f.setEnabled(false);

        et=(EditText)findViewById(R.id.editText);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.setEnabled(true);
                Toast.makeText(MainActivity.this, "You are logged In", Toast.LENGTH_SHORT).show();

            }
        });
        logout=(Button)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f.setEnabled(false);
                Toast.makeText(MainActivity.this, "You are logged Out", Toast.LENGTH_SHORT).show();


            }
        });


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),SendService.class);
                String m=et.getText().toString();
                intent.putExtra("msg",m);
                startService(intent);
            }
        });

    }
}
