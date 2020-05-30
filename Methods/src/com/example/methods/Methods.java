package com.example.methods;

public class Methods {
    public static void main(String[] args) {
        //A void method is one that simply performs a task and then terminates
        //System.out.println("This is a void method");

        // A value-returning method not only performs a task,
        //but also sends a value back to the code that called it

//        int number = Integer.parseInt("700");
//        printAverage(20, 30);
//
//        double average = getAverage(20,30);
//        System.out.println("Average: " + average);
//        System.out.println(fullName("quang", "le"));
        int value = 150;
        if (isValid(value))
        {
            System.out.println("The value is in range!");
        }
        else {
            System.out.println("The value is not in range!");
        }
    }
    public static void printAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        System.out.println("Average: " + average);
    }

    public static double getAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        return average;
    }
    public static String fullName(String name, String surname)
    {
        String fullName = name + " " + surname;
        return fullName;
    }
    //range between 1 and 100
    public static boolean isValid(int number) {
        return (number >= 1 && number <= 100);
    }
}
