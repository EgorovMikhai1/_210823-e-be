package main.java.org.example._2024_02_12.dryKissYagni;

// Нарушение SOLID:
public class Shape {
    public enum Type { CIRCLE, SQUARE }
    
    private Type type;
    
    public Shape(Type type) {
        this.type = type;
    }
    
    public double calculateArea() {
        if (type == Type.CIRCLE) {
            // Вычисление площади круга
        } else if (type == Type.SQUARE) {
            // Вычисление площади квадрата
        }
        return 0.0;
    }
}
