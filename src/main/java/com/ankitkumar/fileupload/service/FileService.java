package com.ankitkumar.fileupload.service;


import com.ankitkumar.fileupload.model.MediaFile;
import com.ankitkumar.fileupload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    FileRepository fileRepository;

    public int uploadFile(String fileName, byte[] fileData, String fileType) {
//        Files.copy()
        return -1;
    }

    private int uploadToDB(String fileName, byte[] fileData, String fileType) {
        MediaFile file = new MediaFile();
        file.setFileName(fileName);
        file.setFileType(fileType);
        file.setData(fileData);
        return fileRepository.addFile(file);
    }
}
