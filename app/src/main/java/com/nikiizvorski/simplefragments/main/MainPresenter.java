package com.nikiizvorski.simplefragments.main;

import com.nikiizvorski.simplefragments.disp.DisplayView;
import com.nikiizvorski.simplefragments.input.InputView;
import com.nikiizvorski.simplefragments.show.ChangerEvent;
import com.nikiizvorski.simplefragments.show.ShowView;

public class MainPresenter implements DisplayView, InputView, ChangerEvent {
    private ShowView mainView;
    private MainIterator mainIterator;

    MainPresenter(ShowView mainView) {
        this.mainView = mainView;
        this.mainIterator = new MainIterator();
    }

    @Override
    public void passDispData(String s) {
        mainIterator.getMeTheString(this,s);
    }

    @Override
    public void passInputData(String s) {
        mainIterator.getMeTheString(this,s);
    }

    @Override
    public void onSuccess(String s) {
        mainView.showMsg(s);
    }

    @Override
    public void onError(String s) {
        mainView.showMsg(s);
    }
}
