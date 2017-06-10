package com.example.math305.agileandroidchapter1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by math305 on 6/7/2017.
 */

public class CalculatorActivity extends Activity{

    Button mAdd;
    EditText mFirstET;
    EditText mSecondET;
    Calculator mCalculator;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        mCalculator = new Calculator();
        mFirstET = (EditText)findViewById(R.id.operand_one_edit_text);
        mSecondET = (EditText)findViewById(R.id.operand_two_edit_text);
        mAdd = (Button)findViewById(R.id.operation_add_btn);

    }

    public void add(View view){
       double one = Double.parseDouble(mFirstET.getText().toString().trim());
       double two = Double.parseDouble(mSecondET.getText().toString().trim());
       double result =  mCalculator.add(one, two);
    }



}
