package com.iit.glidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private  Button mButton;
    private TextView mTopText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("iit","onCreate called");
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);

        mTopText= (TextView) findViewById(R.id.top_text);
        mTopText.setOnClickListener(this);
    }

    protected void onStart(){
        super.onStart();
        Log.v("iit", "onStart called");
    }



    protected void onResume(){
        super.onResume();
        Log.v("iit", "onResume called");
    }

    protected void onPause(){
        super.onPause();
        Log.v("iit", "onPause called");
    }

    protected void onStop(){
        super.onStop();
        Log.v("iit", "onStop called");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.v("iit", "onDestroy called");
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                buttonClicked();
                break;
            case R.id.top_text:
                topTextClicked();
                break;
        }
    }

    private void buttonClicked() {
        Toast.makeText(this, "buttonclicked", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        startActivity(intent);
    }

    private void topTextClicked() {
        Toast.makeText(this, "toptextClicked", Toast.LENGTH_LONG).show();
    }

//    public void clickButtonFromXml(View v){
//        Toast.makeText(this, "buttonclicked from xml", Toast.LENGTH_LONG).show();
//    }



}
