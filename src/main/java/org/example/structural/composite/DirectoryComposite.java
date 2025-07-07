package org.example.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileSystemItem{

    private String name;

    private List<FileSystemItem> children = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item){
        children.add(item);
    }

    public void remove(FileSystemItem item){
        children.remove(item);
    }


    @Override
    public void ls() {
        System.out.println("Director " +name);
        for(FileSystemItem item: children){
            item.ls();
        }
    }
}
