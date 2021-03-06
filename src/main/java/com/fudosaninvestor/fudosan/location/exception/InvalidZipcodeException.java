package com.fudosaninvestor.fudosan.location.exception;

/**
 * Created by Shaochen Huang on 11/8/15.
 */
public class InvalidZipcodeException extends Exception {

    private String zipCode;

    public InvalidZipcodeException(String zipCode) {
        super("Invalid zip code: " + zipCode);
    }

    public String getZipCode() {
        return zipCode;
    }
}
