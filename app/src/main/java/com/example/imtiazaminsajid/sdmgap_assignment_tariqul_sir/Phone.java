package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Phone extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        textView=findViewById(R.id.phoneTextview);

        textView.setText("Basic Knowledge of C, Java, PHP, Android Development, HTML/CSSD");
    }
}
