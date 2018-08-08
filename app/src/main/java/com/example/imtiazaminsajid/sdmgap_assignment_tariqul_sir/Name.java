package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Name extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        textView= findViewById(R.id.nameTextview);

        textView.setText("Imtiaz Amin");
    }
}
