package com.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ejemploNio {
    public static void main(String args []){
        Path archivo = Paths.get("ejemplonio.txt");
        if (Files.notExists(archivo)) {
            try {
                archivo = Files.createFile(Paths.get("ejemplonio.txt"));
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{            
            try {
                var contenido = new String(Files.readAllBytes(Paths.get("ejemplonio.txt")),
                StandardCharsets.UTF_8);
                System.out.println(contenido);
                var text = "Esto es una cadena de prueba";
                Files.write(Paths.get("ejemplonio.txt"), text.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                Files.createDirectories(Paths.get("subcarpeta"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                
        }
    }
}
