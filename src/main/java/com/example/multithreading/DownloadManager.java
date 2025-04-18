package com.example.multithreading;

import java.util.List;

public class DownloadManager {
    public void downloadFiles(List<String> fileNames) {
        for (String file : fileNames) {
            DownloadTask task = new DownloadTask(file);
            task.start(); // Launch new thread for each file
        }
    }
}
