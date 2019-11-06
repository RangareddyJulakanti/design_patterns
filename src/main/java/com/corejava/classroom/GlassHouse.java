package com.corejava.classroom;

public class GlassHouse extends HouseTemplate implements HouseAPI{
    @Override
    public void pillers() {
        System.out.println("Pillers: bricks");
    }

    @Override
    public void windows() {
        System.out.println("Windows: Glass");
    }
}
