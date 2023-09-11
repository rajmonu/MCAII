package com.kailas.loginregistration.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kailas.loginregistration.R;

public class SignUp extends AppCompatActivity {
    Button btn_signup, btn_signin;
    Context context;

    EditText et_first_name, et_last_name, et_email, et_mobile, et_usename, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = SignUp.this;
        setContentView(R.layout.activity_sign_up);
        btn_signin = findViewById(R.id.btn_signin);
        btn_signup = findViewById(R.id.btn_signup);
        et_first_name = findViewById(R.id.et_first_name);
        et_last_name = findViewById(R.id.et_last_name);
        et_email = findViewById(R.id.et_email);
        et_mobile = findViewById(R.id.et_mobile);
        et_usename = findViewById(R.id.et_usename);
        et_password = findViewById(R.id.et_password);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SignIn.class);
                startActivity(intent);
                finish();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registration();
            }
        });
    }

    private void registration() {
        if (validate()){
            String firstNumber = et_first_name.getText().toString();
            String lastName = et_last_name.getText().toString();
            String email = et_email.getText().toString();
            String  mobileNumber = et_mobile.getText().toString();
            String username = et_usename.getText().toString();
            String password = et_password.getText().toString();






            finish();
        }
    }

    private boolean validate() {
        if (et_first_name.getText().toString().isEmpty()){
            et_first_name.setError(getResources().getString(R.string.enter_first_name));
            et_first_name.requestFocus();
            return false;
        }else  if (et_last_name.getText().toString().isEmpty()){
            et_last_name.setError(getResources().getString(R.string.enter_last_name));
            et_last_name.requestFocus();
            return false;
        } else if (et_email.getText().toString().isEmpty()){
            et_email.setError(getResources().getString(R.string.enter_email));
            et_email.requestFocus();
            return false;
        } else if (et_mobile.getText().toString().isEmpty()){
            et_mobile.setError(getResources().getString(R.string.enter_mobile_number));
            et_mobile.requestFocus();
            return false;
        } else if (et_usename.getText().toString().isEmpty()){
            et_usename.setError(getResources().getString(R.string.enter_username));
            et_usename.requestFocus();
            return false;
        } else if (et_password.getText().toString().isEmpty()){
            et_password.setError(getResources().getString(R.string.enter_password));
            et_password.requestFocus();
            return false;
        }
        return true;
    }
}