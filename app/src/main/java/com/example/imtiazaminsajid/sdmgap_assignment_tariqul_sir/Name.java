package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Name extends AppCompatActivity {
    TextView versity, college, school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        versity = findViewById(R.id.versityTextview);
        college = findViewById(R.id.collegeTextview);
        school = findViewById(R.id.schoolTextview);

        versity.setText("Manarat International University");
        college.setText("Noakhali Govt, College");
        school.setText("Noakhali Zilla School");
    }
}
