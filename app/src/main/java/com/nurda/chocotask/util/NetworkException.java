package com.nurda.chocotask.util;

public class NetworkException extends Exception {

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public String getLocalizedMessage() {
        return "Can not connect to internet";
    }

    @Override
    public String toString() {
        return getLocalizedMessage();
    }

}
