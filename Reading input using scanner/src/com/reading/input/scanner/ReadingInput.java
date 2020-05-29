package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
       int firstNumber;
       int secondNumber;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        firstNumber = keyboard.nextInt();

        System.out.println("Please enter the second number: ");
        secondNumber = keyboard.nextInt();

        double average = (firstNumber + secondNumber) / 2.0;
        System.out.println("The average is: " + average);

        String name;
        String surname;

        keyboard.nextLine();
        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Please enter your surname: ");
        surname = keyboard.nextLine();

        System.out.println(name + " " + surname);
    }
}
