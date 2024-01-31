package main.java.org.example._2024_31_01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.FileReader;
import java.io.IOException;

public class YP3 {
    public static void main(String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            FileReader reader = new FileReader("out.yaml");
            TestObject testObject = objectMapper.readValue(reader, TestObject.class);

            System.out.println(testObject.getName());
            System.out.println(testObject.getAge());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}