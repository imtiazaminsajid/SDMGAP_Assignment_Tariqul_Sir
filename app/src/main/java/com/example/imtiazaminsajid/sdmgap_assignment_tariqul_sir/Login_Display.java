package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login_Display extends AppCompatActivity {

    TextView textView;
    ImageButton logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__display);

        textView=findViewById(R.id.email_receiver);

        logout=findViewById(R.id.logout);

        String email_receive = getIntent().getStringExtra("Email");

        textView.setText(email_receive);
    }

    public void logout(View view) {
        finish();
    }
}
