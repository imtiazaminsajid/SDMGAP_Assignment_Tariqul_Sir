package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Email extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        textView=findViewById(R.id.emailTextview);

        textView.setText("imtiaz@gmail.com");
    }
}
