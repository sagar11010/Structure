package com.app.garvigurjari.api;

/**
 * Created by Jatin Patel on 7/12/17.
 */

public interface ResponseCallback {
    /**
     * call when user get success result
     *
     * @param object
     */
    public void ResponseSuccessCallBack(Object object);

    /**
     * call when user get fail result
     *
     * @param object
     */
    public void ResponseFailCallBack(Object object);
}
