package com.example.mysqldbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
EditText Et_name,Et_username,Et_pass;
String name,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Et_name=findViewById(R.id.registername_txt);
        Et_username=findViewById(R.id.registerusername_txt);
        Et_pass=findViewById(R.id.registerpass_txt);
    }

    public void UserRegister(View view) {

        name=Et_name.getText().toString();
        username=Et_username.getText().toString();
        password=Et_pass.getText().toString();
        String method="register";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,name,username,password);
        finish();
    }
}
