package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button plus,negative,multiply,dot,equal,divide,ac;
    Float res1,res2;
    boolean ADD,sub,multi,div,neg,equals;

    Button one, two, three, four, five, six, seven, eight, nine, zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ac=findViewById(R.id.ac);
        editText = findViewById(R.id.editText);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        divide=findViewById(R.id.divide);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eigth);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        plus=findViewById(R.id.plus);
negative=findViewById(R.id.negative);
multiply=findViewById(R.id.multiply);
dot=findViewById(R.id.dot);
equal=findViewById(R.id.equal);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });


     //all symbol of use in calculator

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");

                }else {
                    res1=Float.parseFloat(editText.getText()+"");
                    ADD=true;
                    editText.setText(null);
                }
            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");

                }else {
                    res1=Float.parseFloat(editText.getText()+"");
                   neg =true;
                    editText.setText(null);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");

                }else {
                    res1=Float.parseFloat(editText.getText()+"");
                    multi=true;
                    editText.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");

                }else {
                    res1=Float.parseFloat(editText.getText()+"");
                    div=true;
                    editText.setText(null);
                }
            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res2=Float.parseFloat(editText.getText()+"");
                if(ADD==true){
              editText.setText(res1+res2+"");
              ADD=false;
                }
            if (sub==true){
                editText.setText(res1-res2+"");
                sub=false;
            }
            if (multi==true){
                editText.setText(res1*res2+"");
                multi=false;
            }
            if (div==true){
                editText.setText(res1/res2+"");
            div=false;
            }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });


    }
}