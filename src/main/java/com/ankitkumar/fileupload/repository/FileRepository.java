package com.ankitkumar.fileupload.repository;

import com.ankitkumar.fileupload.model.MediaFile;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository {

    public int addFile(MediaFile file);
}
