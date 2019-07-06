package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String txt[] = {"Addition", "Subtraction", "Multiplication", "Division"};
    private static int count = 0;
    private Button mode;
    private EditText n1,n2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        mode = findViewById(R.id.mode);
    }

    public void changeMode(View view) {
        count++;
        mode.setText("Mode: " + txt[count%4]);
    }

    public void calculate(View view) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        double out = 0.0;
        switch (count%4){
            case 0:
                out = num1+num2;
                break;
            case 1:
                out = num1-num2;
                break;
            case 2:
                out = num1*num2;
                break;
            case 3:

                out = num1/num2;
                break;
        }
        result.setText(Double.toString(out));
    }
}
