package com.sarvex.efficient.chapter10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sarvex.efficient.R;

public class Chapter10Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10);
    }

    public void onFileDownloadActivity(View v) {
        startActivity(new Intent(this, FileDownloadActivity.class));
    }
}
