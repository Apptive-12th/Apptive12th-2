package com.example.instagram_clone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView Hello;
    Button Button;

    View.OnClickListener clickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Hello.setText("버튼 누른거 OK");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hello = findViewById(R.id.Hello); // data binding, java와 xml을 이어주는 것
        Button = findViewById(R.id.Button);

        Hello.setText("헬로우");
        Button.setOnClickListener(clickListner);
        // Log.d(tag:"Oncreate", msg: "실행됨"); >> 안드로이드 스튜디오의 Logcat에 보여지는 것


        //Toast.makeText(getApplicationContext(), "OnCreate", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume(){
        super.onResume();
       // Log.d(tag: "OnResume", msg: "실행됨");
        Hello.setText("반가워요"); // text 바꿔줄 때 setText, text event 설명
    }

    @Override
    protected void onStop(){
        super.onStop();
        Hello.setText("빠염");
    }

    @Override
    public void onClick(View v) {

    }
}
