package myTests;

import java.util.Date;

public class Hello {   // объявляется новый класс
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Date d = new Date();
        System.out.println("Date:" + d.toString());
    }
}
