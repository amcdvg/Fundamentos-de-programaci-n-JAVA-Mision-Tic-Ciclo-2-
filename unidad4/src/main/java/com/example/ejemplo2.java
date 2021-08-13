package com.example;

import java.util.StringTokenizer;

public class ejemplo2 {
    public static void main(String args []){
        String linea = "5;8;9;6;7";
        StringTokenizer token = new StringTokenizer(linea,";");
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
            
        
    }
}
