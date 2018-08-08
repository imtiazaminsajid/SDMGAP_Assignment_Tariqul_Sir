package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton toastButton ;
    Button name, email, phone, id, blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastButton = (ImageButton) findViewById(R.id.toastButton);

        name = (Button) findViewById(R.id.nameButton);
        email = (Button) findViewById(R.id.emailButton);
        phone = (Button) findViewById(R.id.phoneButton);
        id = (Button) findViewById(R.id.idButton);
        blood = (Button) findViewById(R.id.bloodButton);
    }

    public void toast(View view) {
        Toast.makeText(this, "Hello! I am Imtiaz Amin Sajid, what's up?", Toast.LENGTH_LONG).show();
    }
}
