package com.example.multithreading;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> filesToDownload = Arrays.asList(
                "file1.mp4", "file2.zip", "file3.pdf", "file4.jpg", "file5.mp3"
        );

        DownloadManager manager = new DownloadManager();
        System.out.println("Starting downloads...");
        manager.downloadFiles(filesToDownload);
    }
}
