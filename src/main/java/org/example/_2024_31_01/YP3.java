package main.java.org.example._2024_31_01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import main.java.org.example._2024_31_01.taski.University;

import java.io.FileReader;
import java.io.IOException;

public class YP3 {
    public static void main(String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            FileReader reader = new FileReader("1.yaml");
            University testObject = objectMapper.readValue(reader, University.class);

            System.out.println(testObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}