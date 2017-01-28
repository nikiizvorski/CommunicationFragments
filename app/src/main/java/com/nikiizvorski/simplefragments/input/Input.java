package com.nikiizvorski.simplefragments.input;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nikiizvorski.simplefragments.R;
import com.nikiizvorski.simplefragments.main.MainPresenter;


public class Input extends Fragment implements View.OnClickListener {
    InputView inputView;
    Button button;

    public void setPresenter(MainPresenter mainPresenter) {
        this.inputView = mainPresenter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        inputView.passInputData("hahahah");
    }
}
