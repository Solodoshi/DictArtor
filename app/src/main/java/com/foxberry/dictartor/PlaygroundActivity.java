package com.foxberry.dictartor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlaygroundActivity extends AppCompatActivity {
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playground);
        button = findViewById(R.id.button);

    }
}
