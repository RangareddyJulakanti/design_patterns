package com.corejava.design.template;

import com.corejava.design.template.GlassHouse;
import com.corejava.design.template.HouseTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HouseTemplate house=new GlassHouse();
        house.build();
    }

}
