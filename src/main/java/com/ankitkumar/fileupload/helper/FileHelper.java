package com.ankitkumar.fileupload.helper;


import com.ankitkumar.fileupload.constant.FileConstants;
import com.ankitkumar.fileupload.exception.FileSizeExceedsLimitException;
import com.ankitkumar.fileupload.exception.FileTypeNotSupportedException;
import com.ankitkumar.fileupload.exception.MaliciousFileException;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class FileHelper {

    public static final Long MAX_FILE_SIZE = 5L;

    public boolean validateFile(MultipartFile file) throws FileSizeExceedsLimitException, FileTypeNotSupportedException, MaliciousFileException {
        boolean validFileSize = validateFileSize(file.getSize());
        boolean validFileType = checkFileType(file.getContentType());
        boolean safeContent = true;
        try {
            safeContent = checkFileContent(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return validFileSize && validFileType && safeContent;
    }

    private boolean validateFileSize(Long fileSize) throws FileSizeExceedsLimitException {
//        if(MAX_FILE_SIZE < fileSize ){
//            throw new FileSizeExceedsLimitException("File Size cannot exceeds 5 MB");
//        }
        return true;
    }

    private boolean checkFileContent(byte[] fileData) throws MaliciousFileException {
        //if file do not contain any malicious content or file is not corrupt then return true
        return true;
    }

    private boolean checkFileType(String fileType) throws FileTypeNotSupportedException {
        if(!FileConstants.FileType.IMAGE_JPEG.equalsIgnoreCase(fileType)){
            throw new FileTypeNotSupportedException("This file type is not supported. Kindly upload only jpeg files");
        }
        return true;
    }
}
