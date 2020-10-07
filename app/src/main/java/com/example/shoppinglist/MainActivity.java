package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.shoppinglist.extra.MESSAGE";
    private int tVID = -1;
    public static final int TEXT_REQUEST = 1;
    private TextView displayingTV;

    private int currTextView = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Log the start of the onCreate() method.
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

      /*  Intent intent = getIntent();
        String message = intent.getStringExtra(SecondActivity.EXTRA_REPLY);
        tVID = SecondActivity.getTextViewID();
        displayingTV = findViewById(R.id.textView_one);

        if(tVID == 1) {
            displayingTV = findViewById(R.id.textView_one);
        }
        else if(tVID == 2) {
            displayingTV = findViewById(R.id.textView_two);
        }
        else if(tVID == 3) {
            displayingTV = findViewById(R.id.textView_three);
        }
        else if(tVID == 4) {
            displayingTV = findViewById(R.id.textView_four);
        }
        else if(tVID == 5) {
            displayingTV = findViewById(R.id.textView_five);
        }
        else if(tVID == 6) {
            displayingTV = findViewById(R.id.textView_six);
        }
        else if(tVID == 7) {
            displayingTV = findViewById(R.id.textView_seven);
        }
        else if(tVID == 8) {
            displayingTV = findViewById(R.id.textView_eight);
        }
        else if(tVID == 9) {
            displayingTV = findViewById(R.id.textView_nine);
        }
        else if(tVID == 10) {
            displayingTV = findViewById(R.id.textView_ten);
        }

        displayingTV.setText(message); */

        // Restore the state.
        if (savedInstanceState != null) {
          /*  boolean isVisible = savedInstanceState.getBoolean("reply_visible");

            if (isVisible) {
                displayingTV.setVisibility(View.VISIBLE);
                displayingTV.setText(savedInstanceState.getString("reply_text"));
            }
             */
            ConstraintLayout layout = findViewById(R.id.constraintLayout);
            for (int i=0; i<10; i++) {
                TextView view = (TextView)layout.getChildAt(i);
                view.setText(savedInstanceState.getString("text_"+i));
            }
        }
    }


    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button Main Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                ConstraintLayout layout = findViewById(R.id.constraintLayout);
                displayingTV = (TextView)layout.getChildAt(currTextView);
                currTextView++;
                displayingTV.setVisibility(View.VISIBLE);
                displayingTV.setText(reply);
            }
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
       /* if (displayingTV.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", displayingTV.getText().toString());
        } */
        ConstraintLayout layout = findViewById(R.id.constraintLayout);
        for (int i=0; i<10; i++) {
            TextView view = (TextView)layout.getChildAt(i);
            outState.putString("text_"+i, view.getText().toString());
        }
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


   /* @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");

        Intent intent = getIntent();
        String message = intent.getStringExtra(SecondActivity.EXTRA_REPLY);
        tVID = SecondActivity.getTextViewID();
        displayingTV = findViewById(R.id.textView_one);

        if(tVID == 1) {
            displayingTV = findViewById(R.id.textView_one);
        }
        else if(tVID == 2) {
            displayingTV = findViewById(R.id.textView_two);
        }
        else if(tVID == 3) {
            displayingTV = findViewById(R.id.textView_three);
        }
        else if(tVID == 4) {
            displayingTV = findViewById(R.id.textView_four);
        }
        else if(tVID == 5) {
            displayingTV = findViewById(R.id.textView_five);
        }
        else if(tVID == 6) {
            displayingTV = findViewById(R.id.textView_six);
        }
        else if(tVID == 7) {
            displayingTV = findViewById(R.id.textView_seven);
        }
        else if(tVID == 8) {
            displayingTV = findViewById(R.id.textView_eight);
        }
        else if(tVID == 9) {
            displayingTV = findViewById(R.id.textView_nine);
        }
        else if(tVID == 10) {
            displayingTV = findViewById(R.id.textView_ten);
        }

        displayingTV.setText(message);

        displayingTV.setVisibility(View.VISIBLE);
        displayingTV.setText(message);
    } */


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