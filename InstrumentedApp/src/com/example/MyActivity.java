package com.example;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.override.FunfInstrument;

import java.lang.Override;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FunfInstrument.sendEvent(this, "onCreate");
        setContentView(R.layout.main);
    }

    @Override
    protected void onDestroy() {
        FunfInstrument.sendEvent(this, "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        FunfInstrument.sendEvent(this, "onResume");
    }

    @Override
    protected void onPause() {
        FunfInstrument.sendEvent(this, "onPause");
        super.onPause();
    }
}
