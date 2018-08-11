package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Blood extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        textView=findViewById(R.id.bloodTextview);

        textView.setText("Strong leadership skills.\n" +
                "Ambitious and target oriented.\n");
    }
}
