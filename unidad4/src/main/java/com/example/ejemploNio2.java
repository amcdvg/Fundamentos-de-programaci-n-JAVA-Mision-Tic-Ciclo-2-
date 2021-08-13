package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ejemploNio2 {
    public static void main(String args []){
        List<Path> files;
        try {
            files = Files.walk(Paths.get("subcarpeta"))
            /*.filter(Files::isRegularFile)*/
            .map(x -> x.toAbsolutePath())
            .collect(Collectors.toList());

            for (Path file : files) {
                System.out.println("Ruta del fichero: ".concat(file.toString()));
                if(file.isRegularFile()){

                }
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
