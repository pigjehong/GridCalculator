package com.example.appcrate38.gridcalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] butNums=new Button[10];
    Button[] butOps=new Button[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<butNums.length;i++){
            butNums[i]=(Button)findViewById(R.id.button_1+i);
            butNums[i].setOnClickListener(butNumHandler);
        }
        for(int i=0;i<butOps.length;i++){
            butOps[i]=(Button)findViewById(R.id.but_1+i);
            butOps[i].setOnClickListener();
        }
    }
    View.OnClickListener butNumHandler=new View.OnClickListener(){

        @Override
        public void onClick(View view) {

        }
    };
    View.OnClickListener butOpHandler=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}
