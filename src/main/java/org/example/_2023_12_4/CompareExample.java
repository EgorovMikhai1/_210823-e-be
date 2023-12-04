package org.example._2023_12_4;

import java.util.Objects;

public class CompareExample {
    public static void main(String[] args) {
        System.out.println(new Student().hashCode());
        String a = "1";
        String b = "o";
        System.out.println(a.equals(b));
    }
}

class Student {
    int id;
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}