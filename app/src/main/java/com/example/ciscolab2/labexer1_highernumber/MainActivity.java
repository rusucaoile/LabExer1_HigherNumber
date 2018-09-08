package com.example.ciscolab2.labexer1_highernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


           Button HigherNumButton = (Button) findViewById(R.id.HigherNumButton);
        HigherNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView HigherNum = (TextView) findViewById(R.id.HigherNumTextView);
                EditText HigherNumA = (EditText) findViewById(R.id.HigherNumA);
                EditText HigherNumB = (EditText) findViewById(R.id.HigherNumB);
                int a = Integer.parseInt(HigherNumA.getText().toString());
                int b = Integer.parseInt(HigherNumB.getText().toString());
                if(a>b)
                    HigherNum.setText(a + " is higher than " + b);
                else if(b>a)
                    HigherNum.setText(b +" is higher than " + a);
                else
                    HigherNum.setText("Same number.");

            }



        });

    }
}