package com.ankitkumar.fileupload.controller;

import com.ankitkumar.fileupload.constant.FileConstants;
import com.ankitkumar.fileupload.exception.FileSizeExceedsLimitException;
import com.ankitkumar.fileupload.exception.FileTypeNotSupportedException;
import com.ankitkumar.fileupload.exception.MaliciousFileException;
import com.ankitkumar.fileupload.helper.FileHelper;
import com.ankitkumar.fileupload.model.FileResponseEntity;
import com.ankitkumar.fileupload.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
@CrossOrigin("*")
public class FileController {

    @Autowired
    FileService fileService;

    @Autowired
    FileHelper helper;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file")MultipartFile file) throws FileSizeExceedsLimitException, FileTypeNotSupportedException, MaliciousFileException {
        int uploadedFileId = -1;
//        System.out.println(file.getOriginalFilename());
//        System.out.println(file.getSize());
//        System.out.println(file.getContentType());
//        System.out.println(file.getName());

        //validate the file content & size;
        boolean safeFile = helper.validateFile(file);

        if(safeFile){
            try{
                uploadedFileId = fileService.uploadFile(file.getOriginalFilename(), file.getBytes(), file.getContentType());
            }catch(IOException ioe){
                ioe.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ioe.getMessage());
            }
        }
        FileResponseEntity response = new FileResponseEntity(uploadedFileId, FileConstants.Message.UPLOAD_SUCCESSFULLY);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/download")
    public byte[] downloadFile() {
        return new byte[0];
    }
}
