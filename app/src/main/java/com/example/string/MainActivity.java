package com.example.string;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TvMsg2 = findViewById(R.id.tvmsg2);
        TvMsg2.setText(R.string.Msg2);


        Log.i("Lifecycle", "OnCreate() Invoked");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "OnStart() Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "OnResume() Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "OnPause() Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "OnStop() Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "OnDestroy() Invoked");
    }
}


