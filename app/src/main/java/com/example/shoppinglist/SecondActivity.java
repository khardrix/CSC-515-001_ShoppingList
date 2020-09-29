package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.android.shoppinglist.extra.REPLY";
    private static int textViewID = -1;
    private Button mMessageButton;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn1 = findViewById(R.id.button_one);
        btn2 = findViewById(R.id.button_two);
        btn3 = findViewById(R.id.button_three);
        btn4 = findViewById(R.id.button_four);
        btn5 = findViewById(R.id.button_five);
        btn6 = findViewById(R.id.button_six);
        btn7 = findViewById(R.id.button_seven);
        btn8 = findViewById(R.id.button_eight);
        btn9 = findViewById(R.id.button_nine);
        btn10 = findViewById(R.id.button_ten);
    }


    public void onClick(View view) {
        if(view == btn1){
            mMessageButton = btn1;
            textViewID = 1;
        }
        else if(view == btn2) {
            mMessageButton = btn2;
            textViewID = 2;
        }
        else if(view == btn3) {
            mMessageButton = btn3;
            textViewID = 3;
        }
        else if(view == btn4) {
            mMessageButton = btn4;
            textViewID = 4;
        }
        else if(view == btn5) {
            mMessageButton = btn5;
            textViewID = 5;
        }
        else if(view == btn6) {
            mMessageButton = btn6;
            textViewID = 6;
        }
        else if(view == btn7) {
            mMessageButton = btn7;
            textViewID = 7;
        }
        else if(view == btn8) {
            mMessageButton = btn8;
            textViewID = 8;
        }
        else if(view == btn9) {
            mMessageButton = btn9;
            textViewID = 9;
        }
        else if(view == btn10) {
            mMessageButton = btn10;
            textViewID = 10;
        }
    }


    public void returnItem(View view) {
        onClick(view);
        String message = "";

        if(mMessageButton == btn1) {
            Log.d(LOG_TAG, "Button One Clicked!");
            message = getResources().getString(R.string.button_one);
        }
        else if(mMessageButton == btn2) {
            Log.d(LOG_TAG, "Button Two Clicked!");
            message = getResources().getString(R.string.button_two);
        }
        else if(mMessageButton == btn3) {
            Log.d(LOG_TAG, "Button Three Clicked!");
            message = getResources().getString(R.string.button_three);
        }
        else if(mMessageButton == btn4) {
            Log.d(LOG_TAG, "Button Four Clicked!");
            message = getResources().getString(R.string.button_four);
        }
        else if(mMessageButton == btn5) {
            Log.d(LOG_TAG, "Button Five Clicked!");
            message = getResources().getString(R.string.button_five);
        }
        else if(mMessageButton == btn6) {
            Log.d(LOG_TAG, "Button Six Clicked!");
            message = getResources().getString(R.string.button_six);
        }
        else if(mMessageButton == btn7) {
            Log.d(LOG_TAG, "Button Seven Clicked!");
            message = getResources().getString(R.string.button_seven);
        }
        else if(mMessageButton == btn8) {
            Log.d(LOG_TAG, "Button Eight Clicked!");
            message = getResources().getString(R.string.button_eight);
        }
        else if(mMessageButton == btn9) {
            Log.d(LOG_TAG, "Button Nine Clicked!");
            message = getResources().getString(R.string.button_nine);
        }
        else if(mMessageButton == btn10) {
            Log.d(LOG_TAG, "Button Ten Clicked!");
            message = getResources().getString(R.string.button_ten);
        }

        Intent replyIntent = new Intent(this, SecondActivity.class);
        replyIntent.putExtra(EXTRA_REPLY, message);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }


    public static int getTextViewID() {
        return textViewID;
    }


    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }


    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }


    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }


    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }


    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }


    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}