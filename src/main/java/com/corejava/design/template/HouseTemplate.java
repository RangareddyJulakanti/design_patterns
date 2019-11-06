package com.corejava.design.template;

public abstract class HouseTemplate implements HouseAPI{
    public  void basement(){
        System.out.println("Basement: Rocks and sand");
    }
    public void build(){
        basement();
        pillers();
        windows();
    }


}
