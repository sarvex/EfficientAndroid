package com.sarvex.efficient.chapter7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eat.R;

public class Chapter7Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter7);
    }

    public void onThreadRetainActivity(View v) {
        startActivity(new Intent(this, ThreadRetainActivity.class));
    }

    public void onThreadRetainFragment(View v) {
        startActivity(new Intent(this, ThreadRetainWithFragmentActivity.class));
    }
}
