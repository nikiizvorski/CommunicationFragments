package com.nikiizvorski.simplefragments.show;

/**
 * Created by nikiizvorski on 28/01/2017.
 */
public interface ChangerEvent {
    void onSuccess(String s);
    void onError(String s);
}
