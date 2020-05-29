package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = "Peter"; //JOptionPane.showInputDialog("Please enter name 1: ");
        String name2 = "Peter"; //JOptionPane.showInputDialog("Please enter name 2: ");

        if (name1 == name2)
        {
            System.out.println("name 1 is equal to name 2");
        }
       else
        {
            System.out.println("Not the same!");
        }
        System.exit(0);
    }
}
