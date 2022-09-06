package com.ankitkumar.fileupload.model;

public class FileResponseEntity {
    private Integer fileId;
    private String message;

    public FileResponseEntity(Integer fileId, String message) {
        this.fileId = fileId;
        this.message = message;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FileResponseEntity{" +
                "fileId=" + fileId +
                ", message='" + message + '\'' +
                '}';
    }
}
