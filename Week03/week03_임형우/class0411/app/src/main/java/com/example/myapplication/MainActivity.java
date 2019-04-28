package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView hello;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.Hello);
        button = findViewById(R.id.Button);

        hello.setText("헬로우오우");
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                hello.setText("버튼1 눌러짐");
            }
        });



        //Toast.makeText(getApplicationContext(),"OnCreate!!",Toast.LENGTH_SHORT).show();

        Log.d("OnCreate","실행됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(getApplicationContext(),"OnResume!!",Toast.LENGTH_SHORT).show();
        Log.d("Resume","실행됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        hello.setText("바이바이이");
    }

    @Override
    public void onClick(View v) {

    }
}
