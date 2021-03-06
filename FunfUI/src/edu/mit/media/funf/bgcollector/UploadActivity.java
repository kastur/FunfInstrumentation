package edu.mit.media.funf.bgcollector;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import edu.mit.media.funf.probe.builtin.AccelerometerFeaturesProbe;

public class UploadActivity extends Activity {

    private static final String TAG = "UploadActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sendUploadIntent();
    }

    private void sendUploadIntent() {
        Intent uploadIntent = new Intent(this, MainPipeline.class);
        uploadIntent.setAction(MainPipeline.ACTION_UPLOAD_DATA);
        startService(uploadIntent);
    }

    private void runAccelerometerFeaturesProbe() {
        Log.i(TAG, "Running the AccelerometerFeaturesProbe once.");
        Intent runIntent = new Intent();
        runIntent.setClass(this, MainPipeline.class);
        runIntent.setAction(MainPipeline.ACTION_RUN_ONCE);
        String probeName = AccelerometerFeaturesProbe.class.getName();
        runIntent.putExtra(MainPipeline.RUN_ONCE_PROBE_NAME, probeName);
        startService(runIntent);
    }
}
