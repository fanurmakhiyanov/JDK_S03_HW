package ru.geekbrains.JDK_S03_HW;

public class Calculator{
    public static <T extends Number,E extends Number> Number sum(T num1, E num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number,E extends Number> Number multiply(T num1, E num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number,E extends Number> Number divide(T num1, E num2){
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number,E extends Number> Number subtract(T num1, E num2){
        return num1.doubleValue() - num2.doubleValue();
    }

}