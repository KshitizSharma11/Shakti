package com.example.shakti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    EditText firstName,LastName,mobile,email,password,cpassword;
    Button register;
    TextView login;
    FirebaseAuth fauth;
    ProgressBar p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firstName=findViewById(R.id.FirstName);
        LastName=findViewById(R.id.LastNam);
        email=findViewById(R.id.REmail);
        mobile=findViewById(R.id.Phone);
        password=findViewById(R.id.Rpassword);
        cpassword=findViewById(R.id.RcPassword);
    }
}