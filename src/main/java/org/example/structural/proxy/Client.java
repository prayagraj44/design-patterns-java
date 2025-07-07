package org.example.structural.proxy;

public class Client {

    public static void main(String[] args) {

        Image image1 = new RealImage("dog.png");
        Image image2 = new RealImage("dog.png");

        image1.display();
        image1.display();

        System.out.println("\n------------------\n");


        Image proxy = new ProxyImage("cat.png");

        proxy.display();
        proxy.display();



    }
}
