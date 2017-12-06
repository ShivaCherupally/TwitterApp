package com.celebapp.shiva.celebtwitterapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Shiva on 12/6/2017.
 */

public class Welcome extends Activity {
    TextView usernametxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        usernametxt = (TextView) findViewById(R.id.usernametxt);
        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            usernametxt.setText(username + "");
        }

    }
}
