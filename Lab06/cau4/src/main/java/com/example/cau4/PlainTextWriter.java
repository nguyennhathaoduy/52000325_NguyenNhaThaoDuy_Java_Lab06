package com.example.cau4;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class PlainTextWriter implements TextWriter {
    @Override
    public void write(String fileName, String text) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error!!!");
            e.printStackTrace();
        }
    }
}
