package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DBManager manager = new DBManager();
        manager.connect();
        /*manager.findID(123);*/
        /*manager.findAll();*/
        /*manager.getStock(456);*/
        manager.sellBook(456, 4);
    }
}
