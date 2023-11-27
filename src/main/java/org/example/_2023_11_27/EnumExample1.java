package org.example._2023_11_27;

public class EnumExample1 {

    public enum Day {
        MONDAY("work day"),
        WENDSDAY("work day"),
        FRIDAY("day off");

        private final String dayType;

        Day(String dayType) {
            this.dayType = dayType;
        }

        public String getDayType() {
            return dayType;
        }
    }

    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d + " : " + d.getDayType());
        }
    }
}