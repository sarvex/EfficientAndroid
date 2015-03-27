package com.sarvex.efficient.chapter13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eat.R;

public class Chapter13Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter13);
    }

    public void onExpandableContactListActivity(View v) {
        startActivity(new Intent(this, ExpandableContactListActivity.class));
    }
}
