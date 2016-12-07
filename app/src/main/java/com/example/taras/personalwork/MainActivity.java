package com.example.taras.personalwork;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private EditText editText;
    private EditText etInput;
    private House house;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        house = new House();

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);


        etInput = (EditText) findViewById(R.id.editTextStreet);
        editText = (EditText) findViewById(R.id.editTextNumber);

        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(house != null && s != null)house.setStreet(s.toString());
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(house != null && s != null) house.setCountOfPeople(Integer.parseInt(s.toString()));
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(house.toString());
            }
        });
    }
}
