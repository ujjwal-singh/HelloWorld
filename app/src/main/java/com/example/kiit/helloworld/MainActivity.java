package com.example.kiit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String LOG_TAG = MainActivity.class.getSimpleName();
    EditText numberInput;
    TextView squareOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = (EditText) this.findViewById(R.id.numberInput);
        squareOutput = (TextView) this.findViewById(R.id.squareOutput);
    }

    public void calculateSquare(View view) {
        Log.i(LOG_TAG, "Button Pressed called");
        String str = numberInput.getText().toString();
        int num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (Exception e) {
            Toast.makeText(this, "Enter valid number", Toast.LENGTH_SHORT).show();
            return;
        }
        int square = num * num;
        squareOutput.setText(String.valueOf(square));
        Log.d(LOG_TAG, "Button Pressed finished");
    }
}
