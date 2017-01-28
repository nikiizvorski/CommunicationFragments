package com.nikiizvorski.simplefragments.main;


import com.nikiizvorski.simplefragments.show.ChangerEvent;

/**
 * The type Main iterator.
 */
class MainIterator implements MainIteratorImpl{

    /**
     * Instantiates a new Main iterator.
     */
    MainIterator() {}

    @Override
    public void getMeTheString(ChangerEvent changerEvent, String s){
        if (s.length() > 4) changerEvent.onSuccess(s);
        else changerEvent.onError(s);
    }
}
