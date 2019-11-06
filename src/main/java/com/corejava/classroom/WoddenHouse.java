package com.corejava.classroom;

public class WoddenHouse extends HouseTemplate implements HouseAPI{
    @Override
    public void pillers() {
        System.out.println("Pillers: wodden");
    }
    @Override
    public void windows() {
        System.out.println("Windows: wodden");
    }
}
