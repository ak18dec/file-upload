package com.ankitkumar.fileupload.exception;

public class FileSizeExceedsLimitException extends Exception {

    public FileSizeExceedsLimitException(String message) {
        super(message);
    }

    public FileSizeExceedsLimitException(String message, Throwable cause) {
        super(message, cause);
    }
}
