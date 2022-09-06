package com.ankitkumar.fileupload.adapter;

import com.ankitkumar.fileupload.model.MediaFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

public class FileAdapter {

    public static MediaFile convertToMediaFile(MultipartFile input) throws IOException {
        MediaFile file = new MediaFile(1, input.getOriginalFilename(), input.getContentType(), input.getBytes());
        return file;
    }
}
