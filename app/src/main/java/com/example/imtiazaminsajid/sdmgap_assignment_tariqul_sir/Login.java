package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {


    public EditText login_email, password;
    public ImageButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_email =findViewById(R.id.login_email);
        password =findViewById(R.id.password);

        login =findViewById(R.id.login);
    }

    public void login_page(View view) {

        String login_password = password.getText().toString();
        String email_login = login_email.getText().toString();

        Intent intent = new Intent(Login.this, Login_Display.class);
        intent.putExtra("Email",email_login);
        intent.putExtra("Password",login_password);
        startActivity(intent);
    }
}
