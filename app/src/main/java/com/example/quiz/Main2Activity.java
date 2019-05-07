package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public int counter=0;
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1=(Button) findViewById(R.id.btn1);
                btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter=0;
                Intent intent1=new Intent(Main2Activity.this,Mainactivity3.class);
                intent1.putExtra("key",counter);
                startActivity(intent1);
            }
        });
        btn2=(Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 counter++;
                Intent intent1=new Intent(Main2Activity.this,Mainactivity3.class);
                intent1.putExtra("key",counter);
                startActivity(intent1);
            }


        });
        btn3=(Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               counter=0;
                Intent intent1=new Intent(Main2Activity.this,Mainactivity3.class);
                intent1.putExtra("key",counter);
                startActivity(intent1);

            }
        });
    }
}
