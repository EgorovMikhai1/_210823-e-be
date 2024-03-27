package main.java.org.example._2024_03_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Re1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class tempClass =
                Class.forName("main.java.org.example._2024_03_18.Temp");
        Class<Temp> tempClass1 = Temp.class;

        Field field = tempClass.getField("id");
//        System.out.println(field);

//        Field[] fields = tempClass1.getFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }

//        Field[] fields = tempClass1.getDeclaredFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }


        Temp temp = new Temp(1, "name");
//        System.out.println(temp.getPrice());


        Constructor<Temp> constructor = tempClass1.getConstructor(int.class, String.class);
        Object o = constructor.newInstance(2, "NAME");

//        System.out.println(temp);
//        System.out.println(o);

        Field field1 = tempClass1.getDeclaredField("price");
        field1.setAccessible(true);
        double price = temp.getPrice();
        double price1 = (double) field1.get(temp);
//
//        System.out.println(price);
//        System.out.println(price1);

        field1.set(temp, 123456);
        System.out.println(temp.getPrice());

    }
}
