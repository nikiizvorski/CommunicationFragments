package com.nikiizvorski.simplefragments.disp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nikiizvorski.simplefragments.R;
import com.nikiizvorski.simplefragments.main.MainPresenter;

public class Display extends Fragment implements View.OnClickListener {
    private DisplayView displayView;
    Button button2;

    public void setPresenter(MainPresenter mainPresenter) {
        this.displayView = mainPresenter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        displayView.passDispData("bahahhaha");
    }
}
