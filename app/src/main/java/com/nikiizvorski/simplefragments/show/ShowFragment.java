package com.nikiizvorski.simplefragments.show;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nikiizvorski.simplefragments.R;

public class ShowFragment extends Fragment implements ShowView{
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show, container, false);
        textView = (TextView) view.findViewById(R.id.texta);
        return view;
    }

    @Override
    public void showMsg(String s) {
        textView.setText(s);
    }
}
