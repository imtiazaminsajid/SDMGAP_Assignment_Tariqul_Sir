package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Email extends AppCompatActivity {

    TextView father,mother, blood, addresss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        father =findViewById(R.id.fatherTextview);
        mother =findViewById(R.id.motherTextview);
        blood =findViewById(R.id.bloodTextview);
        addresss =findViewById(R.id.addressTextview);

        father.setText("Father: Nurul Amin");
        mother.setText("Mother: Shahin Ara Begum");
        blood.setText("Blood: A+");
        addresss.setText("Address: Dhaka");
    }
}
