package com.nseit.blog.exception;

public class UnableToInsertException extends RuntimeException {
    public UnableToInsertException(String msg) {
        super(msg);
    }
}