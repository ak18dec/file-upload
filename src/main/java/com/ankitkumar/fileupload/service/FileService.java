package com.ankitkumar.fileupload.service;


import com.ankitkumar.fileupload.model.MediaFile;
import com.ankitkumar.fileupload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    FileRepository fileRepository;

    public int uploadFile(MediaFile file) {
//        Files.copy()
        return -1;
    }

    private int uploadToDB(String name, byte[] data, String type) {
        MediaFile file = new MediaFile();
        file.setName(name);
        file.setType(type);
        file.setData(data);
        return fileRepository.addFile(file);
    }
}
