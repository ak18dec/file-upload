package com.ankitkumar.fileupload.exception.handler;

import com.ankitkumar.fileupload.exception.FileSizeExceedsLimitException;
import com.ankitkumar.fileupload.exception.FileTypeNotSupportedException;
import com.ankitkumar.fileupload.exception.MaliciousFileException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({FileTypeNotSupportedException.class, FileSizeExceedsLimitException.class, MaliciousFileException.class})
    public ResponseEntity<ErrorMessageEntity> handleFileException(Exception e, WebRequest request){
        ErrorMessageEntity entity = new ErrorMessageEntity(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(entity);
    }


}
