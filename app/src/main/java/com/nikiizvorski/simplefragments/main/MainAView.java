package com.nikiizvorski.simplefragments.main;

import com.nikiizvorski.simplefragments.disp.Display;
import com.nikiizvorski.simplefragments.input.Input;
import com.nikiizvorski.simplefragments.show.ShowFragment;

interface MainAView {
    void initPresenter(Display display, Input input, ShowFragment showFragment);
}
