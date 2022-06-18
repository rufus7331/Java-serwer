package pl.ans.server.dto;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FileData {
    private String fileName;
    private Long size;
    private ZonedDateTime creationDate;

    public FileData(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}