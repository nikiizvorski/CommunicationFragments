package com.nikiizvorski.simplefragments.show;

/**
 * Created by nikiizvorski on 28/01/2017.
 */
public interface ChangerEvent {
    /**
     * On success.
     *
     * @param s the s
     */
    void onSuccess(String s);

    /**
     * On error.
     *
     * @param s the s
     */
    void onError(String s);
}
