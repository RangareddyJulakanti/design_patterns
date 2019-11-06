package CoreJava;

import com.corejava.classroom.GlassHouse;
import com.corejava.classroom.HouseTemplate;
import com.corejava.classroom.WoddenHouse;

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
