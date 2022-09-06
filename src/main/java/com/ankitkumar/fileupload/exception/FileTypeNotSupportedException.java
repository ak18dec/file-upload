package com.ankitkumar.fileupload.exception;

public class FileTypeNotSupportedException extends Exception {

    public FileTypeNotSupportedException(String message){
        super(message);
    }
    public FileTypeNotSupportedException(String message, Throwable cause){
        super(message, cause);
    }
}
