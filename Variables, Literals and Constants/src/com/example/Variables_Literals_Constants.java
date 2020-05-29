package com.example;

public class Variables_Literals_Constants
{
    public static void main(String[] args) {
        final int firstNumber;
        int secondNumber;

        firstNumber = 11; //cannot be changed
        secondNumber = 20;

        double average;
        average =  (firstNumber + secondNumber)/2.0;
        System.out.println("Average" + average);

        String name;
        String surname;

        name = "John";
        surname = "Rambo";
        System.out.println(name + " " + surname);

        boolean value;
        value = false;
        System.out.println(value);

        char letter;
        letter = 'j';
        System.out.println(letter);

    }
}
