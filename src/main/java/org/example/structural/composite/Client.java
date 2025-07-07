package org.example.structural.composite;

public class Client {

    public static void main(String[] args) {

        DirectoryComposite root = new DirectoryComposite("root");
        root.add(new FileLeaf("db.docx"));
        root.add(new FileLeaf("asda.pdf"));

        DirectoryComposite subDir = new DirectoryComposite("new folder");
        subDir.add(new FileLeaf("asda.txt"));

        root.add(subDir);

        root.ls();



    }

}
