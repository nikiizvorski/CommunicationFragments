package com.nikiizvorski.simplefragments.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nikiizvorski.simplefragments.disp.Display;
import com.nikiizvorski.simplefragments.input.Input;
import com.nikiizvorski.simplefragments.R;
import com.nikiizvorski.simplefragments.show.ShowFragment;

public class MainActivity extends AppCompatActivity implements MainAView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display display = (Display) getSupportFragmentManager().findFragmentById(R.id.display);
        Input input = (Input) getSupportFragmentManager().findFragmentById(R.id.input);
        ShowFragment showFragment = (ShowFragment) getSupportFragmentManager().findFragmentById(R.id.show);
        initPresenter(display, input, showFragment);
    }

    @Override
    public void initPresenter(Display display, Input input, ShowFragment showFragment) {
        MainPresenter mainPresenter = new MainPresenter(showFragment);
        display.setPresenter(mainPresenter);
        input.setPresenter(mainPresenter);
    }
}
