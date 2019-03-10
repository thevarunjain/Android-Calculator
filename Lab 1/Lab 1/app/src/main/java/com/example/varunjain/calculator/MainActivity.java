package com.example.varunjain.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button add, sub, mul, div;
    private EditText input1, input2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();

//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                output.setText("Hello Mummy");
//            }
//        });
    }

    private void setupUI()
    {
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.output);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();

        switch (view.getId()){
            case R.id.add:
                try{
                    int addr = Integer.parseInt(num1) + Integer.parseInt(num2);
                    output.setText("Output "+String.valueOf(addr));
                }catch (Exception e){
                output.setText("Please enter the number");
            }
                break;
            case R.id.sub:
                try{
                int subr = Integer.parseInt(num1) - Integer.parseInt(num2);
                output.setText("Output "+String.valueOf(subr));
                }catch (Exception e){
            output.setText("Please enter the number");
        }
                break;
            case R.id.mul:
                try{
                int mulr = Integer.parseInt(num1) * Integer.parseInt(num2);
                output.setText("Output "+String.valueOf(mulr));
                 }catch (Exception e){
                    output.setText("Please enter the number");
                 }
                break;
            case R.id.div:
                try{
                    int divr = Integer.parseInt(num1) / Integer.parseInt(num2);
                    output.setText("Output "+String.valueOf(divr));
                }catch (Exception e){
                    output.setText("Cannot Divide");
                }
                break;

        }


    }
}
