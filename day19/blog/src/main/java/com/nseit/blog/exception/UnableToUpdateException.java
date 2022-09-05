package com.nseit.blog.exception;

public class UnableToUpdateException extends RuntimeException {
    public UnableToUpdateException(String msg) {
        super(msg);
    }
}