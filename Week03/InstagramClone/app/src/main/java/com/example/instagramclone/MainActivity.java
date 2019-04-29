package com.example.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Hello;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Hello = findViewById(R.id.Hello);

        Hello.setText("onCreate");

        button = findViewById(R.id.button);
        button.setOnClickListener(this);


        Log.d("onCreate", "실행됨");
        Toast.makeText(getApplicationContext(), "Oncreate 호출됨", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Hello.setText("잘가라");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "실행됨");
        Toast.makeText(getApplicationContext(), "onResume 호출됨", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Hello.setText("버튼이 눌렸어요.");
    }
}
