package org.example.structural.flyweight;

public class BulletType implements Bullet{

    private final String sprite;
    private final String color;

    public BulletType(String sprite, String color) {
        this.sprite = sprite;
        this.color = color;
    }

    @Override
    public void render(int x, int y, double direction, double velocity) {
        System.out.println("Draw '%s' color=%d at(%d,%d), dir=%.1f, vel=%.f%n".formatted(sprite, color,x,y,direction, velocity));
    }


}
