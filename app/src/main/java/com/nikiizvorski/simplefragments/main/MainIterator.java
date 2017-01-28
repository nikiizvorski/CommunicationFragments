package com.nikiizvorski.simplefragments.main;


import com.nikiizvorski.simplefragments.show.ChangerEvent;

class MainIterator implements MainIteratorImpl{

    MainIterator() {}

    @Override
    public void getMeTheString(ChangerEvent changerEvent, String s){
        if (s.length() > 4) changerEvent.onSuccess(s);
        else changerEvent.onError(s);
    }
}
