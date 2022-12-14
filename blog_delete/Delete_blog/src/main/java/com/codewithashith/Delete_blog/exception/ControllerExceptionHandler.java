package com.codewithashith.Delete_blog.exception;

import com.codewithashith.Delete_blog.response.APIResponse;
import com.codewithashith.Delete_blog.response.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @Autowired
    private APIResponse apiResponse;

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponse> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        apiResponse = errorResponseBuilder(ex.getMessage(), request);
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceAlreadyExistException.class)
    public ResponseEntity<APIResponse> userExistException(ResourceAlreadyExistException ex, WebRequest request) {
        apiResponse = errorResponseBuilder(ex.getMessage(), request);

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnableToInsertException.class)
    public ResponseEntity<APIResponse> unableToInsertException(ResourceAlreadyExistException ex, WebRequest request) {
        apiResponse = errorResponseBuilder(ex.getMessage(), request);

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnableToUpdateException.class)
    public ResponseEntity<APIResponse> unableToUpdateException(ResourceAlreadyExistException ex, WebRequest request) {
        apiResponse = errorResponseBuilder(ex.getMessage(), request);

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIResponse> globalExceptionHandler(Exception ex, WebRequest request) {
        apiResponse = errorResponseBuilder(ex.getMessage(), request);

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    private APIResponse errorResponseBuilder(String ex, WebRequest request) {
        ErrorResponse message = new ErrorResponse(
                ex, request.getDescription(false));
        apiResponse.setStatus(HttpStatus.NOT_FOUND.value());
        apiResponse.setError(message);

        LOGGER.error(message.getMessage());

        return apiResponse;
    }

}