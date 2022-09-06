package com.ankitkumar.fileupload.constant;

//this class is final to prevent it from being extended
public final class FileConstants {

    //constructor is private so that the class can't be instantiated
    private FileConstants() {

    }

    public final class FileType {
        public static final String IMAGE_JPEG="image/jpeg";
    }

    public final class FileDirectory {
        public static final String UPLOAD_DIRECTORY="";
    }

    public final class Message {
        public static final String UPLOAD_SUCCESSFULLY = "File uploaded successfully";
    }


}
