package com.example.imtiazaminsajid.sdmgap_assignment_tariqul_sir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    double fn=0;
    double sn=0;
    String operator;

    TextView et,et2;
    Button back;
    Button clear;
    Button plus;
    Button minus;
    Button b7;
    Button b8;
    Button b9;
    Button multi;
    Button b4;
    Button b5;
    Button b6;
    Button div;
    Button b1;
    Button b2;
    Button b3;
    Button equal;
    Button dot;
    Button b0;
    Button plus_equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        et = findViewById(R.id.et);
        et2 = findViewById(R.id.et2);
        back = findViewById(R.id.back);
        clear = findViewById(R.id.clear);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        multi = findViewById(R.id.multi);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        div = findViewById(R.id.div);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        b0 = findViewById(R.id.b0);
        plus_equal = findViewById(R.id.plus_equal);



        back.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        multi.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        div.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);
        b0.setOnClickListener(this);
        plus_equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String string = et.getText().toString();

        switch (v.getId()){
            case R.id.b0:
                et.setText(string+b0.getText());

            case R.id.b1:
                et.setText(string+b1.getText());
                break;

            case R.id.b2:
                et.setText(string+b2.getText());
                break;

            case R.id.b3:
                et.setText(string+b3.getText());
                break;

            case R.id.b4:
                et.setText(string+b4.getText());
                break;

            case R.id.b5:
                et.setText(string+b5.getText());
                break;

            case R.id.b6:
                et.setText(string+b6.getText());
                break;

            case R.id.b7:
                et.setText(string+b7.getText());
                break;

            case R.id.b8:
                et.setText(string+b8.getText());
                break;

            case R.id.b9:
                et.setText(string+b9.getText());
                break;

            case R.id.dot:
                et.setText(string+dot.getText());
                break;

            case R.id.clear:
                et.setText("");
                et2.setText("");
                break;

            case R.id.back:
                StringBuilder stringBuilder = new StringBuilder(string);
                stringBuilder.deleteCharAt(string.length()-1);
                et.setText(stringBuilder.toString());
                break;

            case R.id.plus:
                operator = "+";
                fn= Double.parseDouble(et.getText().toString());
                et2.setText(fn+"+");
                et.setText("");
                break;

            case R.id.minus:
                operator = "-";
                fn= Double.parseDouble(et.getText().toString());
                et2.setText(fn+"-");
                et.setText("");
                break;

            case R.id.multi:
                operator = "x";
                fn= Double.parseDouble(et.getText().toString());
                et2.setText(fn+"x");
                et.setText("");
                break;

            case R.id.div:
                operator = "÷";
                fn= Double.parseDouble(et.getText().toString());
                et2.setText(fn+"÷");
                et.setText("");
                break;

            case R.id.plus_equal:
                et.setText(Double.parseDouble(et.getText().toString())*(1)+"");
                break;

            case R.id.equal:
                sn = Double.parseDouble(et.getText().toString());
                et2.setText(fn+""+operator+""+sn);
                double result = 0;
                switch (operator){
                    case "+":
                        result= fn+sn;
                        break;

                    case "-":
                        result= fn-sn;
                        break;
                    case "x":
                        result= fn*sn;
                        break;
                    case "÷":
                        result= fn/sn;
                        break;

                }
                et.setText("="+result);

//            case R.id.close:
//                finish();
        }

    }
}
