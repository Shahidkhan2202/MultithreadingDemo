
package com.example.multithreading;

public class DownloadTask extends Thread {
    private final String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Started downloading: " + fileName);
        try {
            // Simulate time taken to download
            Thread.sleep((long) (Math.random() * 3000 + 1000));
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
        System.out.println("Finished downloading: " + fileName);
    }
}