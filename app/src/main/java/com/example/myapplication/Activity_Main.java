package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Main extends AppCompatActivity {
private EditText mEdidText1;
    private EditText mEdidText2;
    private TextView mTextView;

    private Button mButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdidText1=findViewById(R.id.EditText_num1);
        mEdidText2=findViewById(R.id.EditText_num2);
        mTextView=findViewById(R.id.TextView_res);
        mButton=findViewById(R.id.button_res);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clacArmpitDeep();
                openCalc();


            }
        });


    }

    private void openCalc()
    {
        Intent myIntent = new Intent(Activity_Main.this, Activity_result.class);

        startActivity(myIntent);



    }

    private void clacArmpitDeep()
    {
        if (mEdidText1.getText().toString().length()==0)
            mEdidText1.setText("0");
        if (mEdidText2.getText().toString().length()==0)
            mEdidText2.setText("0");
        int num1=Integer.parseInt(mEdidText1.getText().toString());
        int num2=Integer.parseInt(mEdidText2.getText().toString());

        double res=num1*0.1+10.5;

        mTextView.setText(String.valueOf(res));


    }

    private void clacBackLength()
    {

        int num1=Integer.parseInt(mEdidText1.getText().toString());
        int num2=Integer.parseInt(mEdidText2.getText().toString());

        double res=num1*0.1+10.5;

        mTextView.setText(String.valueOf(res));


    }

    private void clacHipHeight()
    {

        int num1=Integer.parseInt(mEdidText1.getText().toString());
        int num2=Integer.parseInt(mEdidText2.getText().toString());

        double res=num1*0.1+10.5;

        mTextView.setText(String.valueOf(res));


    }

    private void clacSeamLength()
    {

        int num1=Integer.parseInt(mEdidText1.getText().toString());
        int num2=Integer.parseInt(mEdidText2.getText().toString());

        double res=num1*0.1+10.5;

        mTextView.setText(String.valueOf(res));


    }











}