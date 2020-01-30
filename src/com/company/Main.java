package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0 ) System.out.println("You must enter a user name as a parameter.");
        else System.out.println(String.format("%s, you did it! Hello World!!", args[0]));
    }
}
