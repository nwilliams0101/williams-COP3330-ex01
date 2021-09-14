package com.exercise1.sayinghello;
import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {
        String name;

       System.out.println("What is your name?");

       Scanner input = new Scanner(System.in);
       name = input.nextLine();

       System.out.println("Hello, " + name + ", nice to meet you!");

    }
}
