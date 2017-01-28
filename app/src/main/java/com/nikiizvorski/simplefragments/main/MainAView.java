package com.nikiizvorski.simplefragments.main;

import com.nikiizvorski.simplefragments.disp.Display;
import com.nikiizvorski.simplefragments.input.Input;
import com.nikiizvorski.simplefragments.show.ShowFragment;

/**
 * The interface Main a view.
 */
interface MainAView {
    /**
     * Init presenter.
     *
     * @param display      the display
     * @param input        the input
     * @param showFragment the show fragment
     */
    void initPresenter(Display display, Input input, ShowFragment showFragment);
}
