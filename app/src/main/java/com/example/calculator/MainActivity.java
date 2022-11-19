package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Add(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n4 = Integer.parseInt(et4.getText().toString());
        int result = n1+n2+n4;

        et3.setText("Total Value" +result);
    }

    public void Subtract(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n4 = Integer.parseInt(et4.getText().toString());
        int result = n1-n2-n4;

        et3.setText("Subtract Value" +result);
    }
    public void Multiply(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n4 = Integer.parseInt(et4.getText().toString());
        int result = n1*n2*n4;

        et3.setText("Multiply Value" +result);
    }
    public void Divide(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n4 = Integer.parseInt(et4.getText().toString());
        int result = n1/n2/n4;

        et3.setText("Divide Value" +result);
    }
}