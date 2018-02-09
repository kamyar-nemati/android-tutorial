package com.kamyar.tutorial.fragmentsdiscussion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.TopFragmentInterface {

    TopFragment topFragment;
    BottomFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topFragment = (TopFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        bottomFragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
    }

    @Override
    public void sendMessage(String message) {
        bottomFragment.setMessage(message);
    }

}
