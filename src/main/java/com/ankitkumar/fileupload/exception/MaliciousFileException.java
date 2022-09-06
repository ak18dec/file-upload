package com.ankitkumar.fileupload.exception;

public class MaliciousFileException extends Exception {

    public MaliciousFileException(String message){
        super(message);
    }
    public MaliciousFileException(String message, Throwable cause){
        super(message, cause);
    }
}
