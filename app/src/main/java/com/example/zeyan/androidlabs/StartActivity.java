package com.example.zeyan.androidlabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class StartActivity extends Activity {

    protected static final String ACTIVITY_NAME = "StartActivity";
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        buttonStart = (Button)findViewById(R.id.buttonText);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,ListItemsActivity.class);
                startActivityForResult(intent, 50);
            }
        });

        Log.i(ACTIVITY_NAME,"in onCreate()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME,"in onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_NAME,"in onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_NAME,"in onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_NAME,"in onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_NAME,"in onDestroy()");
    }

    protected void onActivityResult(int requestCode, int responseCode, Intent data){
        if(requestCode==50){
            Log.i(ACTIVITY_NAME, "Returned to StartActivity.onActivityResult");
        }
        if(responseCode== Activity.RESULT_OK){
            String messagePassed = data.getStringExtra("Response");
            Toast.makeText(StartActivity.this, "ListItemsActivity passed: "+messagePassed, Toast.LENGTH_LONG).show();
        }
    }
}
