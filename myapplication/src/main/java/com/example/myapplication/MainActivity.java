package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.RadioButton01) {
                    Toast.makeText(getApplicationContext(), "choice: 1", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.RadioButton02) {
                    Toast.makeText(getApplicationContext(), "choice: 2", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.RadioButton03) {
                    Toast.makeText(getApplicationContext(), "choice: 3", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.RadioButton04) {
                    Toast.makeText(getApplicationContext(), "choice: 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}