package org.example.structural.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();

    }

    @Override
    public void display() {

    }

    private void loadImageFromDisk(){
        System.out.println("Loading image from disk "+ fileName);
    }
}
