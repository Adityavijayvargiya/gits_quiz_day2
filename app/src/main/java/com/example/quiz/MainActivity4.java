package com.example.quiz;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    public  int count;
    Button result ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final TextView textView = (TextView) findViewById(R.id.textView3);
        result = (Button) findViewById(R.id.submit_area);

        result.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                //Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                count = getIntent().getExtras().getInt("key1");

                     textView.setText("Score is " + count);
                    }
                });
            }

}