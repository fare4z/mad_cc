package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAge, etState;
    Button btnSubmit;
    TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvOutput = findViewById(R.id.tvOutput);
        etAge = findViewById(R.id.etAge);
        etState = findViewById(R.id.etState);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOutput.setText("Hi, my name is " + etName.getText() +
                        "\n I am " + etAge.getText() + " years old" +
                        "\n and i'm from " + etState.getText());
            }
        });


    }
}