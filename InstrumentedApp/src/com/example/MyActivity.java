package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.lang.Override;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doInstrument("onCreate");
        setContentView(R.layout.main);
    }

    @Override
    protected void onDestroy() {
        doInstrument("onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        doInstrument("onResume");
    }

    @Override
    protected void onPause() {
        doInstrument("onPause");
        super.onPause();
    }

    private void doInstrument(String event) {
        Intent notifyIntent = new Intent("edu.mit.media.funf.bgcollector.MainPipeline");
        notifyIntent.putExtra("PKG_NAME", getPackageName());
        notifyIntent.putExtra("CLS_NAME", getClass().getName());
        notifyIntent.putExtra("EVENT_NAME", event);
        startService(notifyIntent);
    }
}
