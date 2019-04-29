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
    Button Button;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Hello.setText("버튼 누른거 OK");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hello = findViewById(R.id.Hello);
        Button = findViewById(R.id.Button);

        Hello.setText("헬로우");
        Button.setOnClickListener(this);

        Log.d("OnCreate", "실행됨");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Hello.setText("반가워요");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("OnResume", "실행됨");
    }


    @Override
    public void onClick(View v) {
        Hello.setText("버튼1 눌러짐");
    }
}
