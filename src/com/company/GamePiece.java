package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class GamePiece {

    int positionX;
    int positionY;
    boolean frozen;

    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;

        this.name = "piece1";
        this.color = "red";


    }

    public int getPositionX() {
        return positionX;
    }


    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void freeze() {
        if (frozen == true) {
            frozen = false;
        } else {
            frozen = true;
        }
    }

    public void move() {
        if (frozen == true) {
            positionX = positionX;
            positionY = positionY;
        } else {
            positionX = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            ;
            positionY = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            ;
        }


    }

}

class Main {

    public static void main(String[] args) {

        GamePiece Rook = new GamePiece();

        Rook.setColor("red");
        Rook.setName("Rook");

        System.out.println(Rook.getName());
        System.out.println(Rook.getColor());
        System.out.println(Rook.getPositionX());
        System.out.println(Rook.getPositionY());
        System.out.println(Rook.isFrozen());


        Rook.move();
        System.out.println(Rook.getPositionY());
        System.out.println(Rook.getPositionX());
        Rook.freeze();


        System.out.println(Rook.isFrozen());
        Rook.move();
        System.out.println(Rook.getPositionY());
        System.out.println(Rook.getPositionX());


    }
}
