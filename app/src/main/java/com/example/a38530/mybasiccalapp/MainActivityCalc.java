package com.example.a38530.mybasiccalapp;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
@SuppressWarnings("FieldCanBeLocal")
public class MainActivityCalc extends AppCompatActivity implements View.OnClickListener{
    private Button btnAdd,btnSub,btnMulti,btnDiv;
    private TextView et_Result;
    private EditText et_FirstNumber, et_SecondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);
        init();
    }

    private void init(){
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        et_FirstNumber=(EditText)findViewById(R.id.et_FirstNumber);
        et_SecondNumber=(EditText)findViewById(R.id.et_SecondNumber);
        et_Result=(TextView)findViewById(R.id.et_Result);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        String num1=et_FirstNumber.getText().toString();
        String num2=et_SecondNumber.getText().toString();
    switch (view.getId()){
        case R.id.btnAdd:
            int Addition= Integer.parseInt(num1) + Integer.parseInt(num2);
            et_Result.setText(String.valueOf(Addition));
            break;
        case R.id.btnSub:
            int Subtraction=Integer.parseInt(num1) - Integer.parseInt(num2);
            et_Result.setText(String.valueOf(Subtraction));
            break;
        case R.id.btnMulti:
            int Multiply=Integer.parseInt(num1) * Integer.parseInt(num2);
            et_Result.setText(String.valueOf(Multiply));
            break;
        case R.id.btnDiv:
            try{
                int Division=Integer.parseInt(num1) / Integer.parseInt(num2);
                et_Result.setText(String.valueOf(Division));
            }catch (Exception e)
            {
                et_Result.setText("Cannot Divide !!!");
            }
            break;
    }
    }
}
