package Modue6Lectures;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

//Check API to see what he outputs will be
public class TestMath {
    public static void main(String[] args) {
        System.out.println("Math.abs(-5.5):" + Math.abs(-5.5));

        System.out.println("Math.cbrt(25):" + Math.cbrt(25));

        System.out.println("Math.sqrt(25): " + Math.sqrt(25));

        System.out.println("Math.ceil (3.1): " + Math.ceil(3.1));

        System.out.println("Math.floor (3.1): " + Math.floor(3.1));

        System.out.println("Math.round (3.1): " + Math.round(3.1));

        System.out.println("Math.max (100, 200): " + Math.max(100, 200));

        System.out.println("Math.min (100, 200): " + Math.min(100, 200));

        System.out.println("Math.random (): " + Math.random());
        for ( int i = 0; i < 10; i++)// allow for condition to determine numbers picked
            System.out.println( i + " i " + Math.random());// This will give you 10 random numbers
        // Random numbers from 0 to 9

    }
}
