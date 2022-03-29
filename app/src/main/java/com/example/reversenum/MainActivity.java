package com.example.reversenum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    TextView res;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.num);
        res= findViewById(R.id.res);
        add= findViewById(R.id.btn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n= Integer.parseInt(num.getText().toString());
                int rn=0,r;
                while (n!=0){
                    r=n%10;
                    rn=rn*10+r;
                    n=n/10;

                }
                res.setText("Reverse No : "+rn);
            }
        });
    }
}