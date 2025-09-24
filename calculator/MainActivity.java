package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttondot, buttonadd, buttonsub, buttondiv, buttonmul, buttonC, buttoneql;
    EditText result;
    float mvalueone, mvaluetwo;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Match buttons to their XML IDs
        button0 = findViewById(R.id.btn15);     // "0"
        button1 = findViewById(R.id.btn1);      // "1"
        button2 = findViewById(R.id.btn2);      // "2"
        button3 = findViewById(R.id.btn3);      // "3"
        button4 = findViewById(R.id.btn5);      // "4"
        button5 = findViewById(R.id.btn6);      // "5"
        button6 = findViewById(R.id.btn7);      // "6"
        button7 = findViewById(R.id.btn9);      // "7"
        button8 = findViewById(R.id.btn10);     // "8"
        button9 = findViewById(R.id.btn11);     // "9"

        buttonadd = findViewById(R.id.btn4);    // "+"
        buttonsub = findViewById(R.id.btn8);    // "-"
        buttonmul = findViewById(R.id.btn13);   // "X"
        buttondiv = findViewById(R.id.btn12);   // "/"
        buttondot = findViewById(R.id.btn14);   // "."
        buttonC = findViewById(R.id.btn16);     // "C"
        buttoneql = findViewById(R.id.buttoneql); // "="

        result = findViewById(R.id.editTextText); // EditText

        // Digit and dot buttons
        button1.setOnClickListener(v -> result.append("1"));
        button2.setOnClickListener(v -> result.append("2"));
        button3.setOnClickListener(v -> result.append("3"));
        button4.setOnClickListener(v -> result.append("4"));
        button5.setOnClickListener(v -> result.append("5"));
        button6.setOnClickListener(v -> result.append("6"));
        button7.setOnClickListener(v -> result.append("7"));
        button8.setOnClickListener(v -> result.append("8"));
        button9.setOnClickListener(v -> result.append("9"));
        button0.setOnClickListener(v -> result.append("0"));
        buttondot.setOnClickListener(v -> result.append("."));

        // Clear button
        buttonC.setOnClickListener(v -> result.setText(""));

        // Operator buttons
        buttonadd.setOnClickListener(v -> {
            if (!result.getText().toString().equals("")) {
                mvalueone = Float.parseFloat(result.getText().toString());
                add = true;
                result.setText(null);
            }
        });

        buttonsub.setOnClickListener(v -> {
            if (!result.getText().toString().equals("")) {
                mvalueone = Float.parseFloat(result.getText().toString());
                sub = true;
                result.setText(null);
            }
        });

        buttonmul.setOnClickListener(v -> {
            if (!result.getText().toString().equals("")) {
                mvalueone = Float.parseFloat(result.getText().toString());
                mul = true;
                result.setText(null);
            }
        });

        buttondiv.setOnClickListener(v -> {
            if (!result.getText().toString().equals("")) {
                mvalueone = Float.parseFloat(result.getText().toString());
                div = true;
                result.setText(null);
            }
        });

        // Equal button
        buttoneql.setOnClickListener(v -> {
            if (!result.getText().toString().equals("")) {
                mvaluetwo = Float.parseFloat(result.getText().toString());

                if (add) {
                    result.setText(String.valueOf(mvalueone + mvaluetwo));
                    add = false;
                } else if (sub) {
                    result.setText(String.valueOf(mvalueone - mvaluetwo));
                    sub = false;
                } else if (mul) {
                    result.setText(String.valueOf(mvalueone * mvaluetwo));
                    mul = false;
                } else if (div) {
                    if (mvaluetwo != 0) {
                        result.setText(String.valueOf(mvalueone / mvaluetwo));
                    } else {
                        result.setText("Error");
                    }
                    div = false;
                }
            }
        });
    }
}
