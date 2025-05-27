package com.campusdual.classroom;

import java.nio.file.Files;
import java.util.List;
import java.nio.file.Paths;

public class Exercise31 {

    public static void main(String[] args) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("src/main/resources/lorem.txt"));
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (Exception e) {
          e.printStackTrace();
        }

    }
}
