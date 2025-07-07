package org.example.structural.composite;

public class FileLeaf implements FileSystemItem{

    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File: "+name);
    }
}
