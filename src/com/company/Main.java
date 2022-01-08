package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Does the food have spinach in it? (y/n)");
        String hasSpinach = sc.next();

        System.out.println("Does it have a funny name? (y/n)");
        String funnyName = sc.next();

        System.out.println("Is it covered in cheese? (y/n)");
        String cheese = sc.next();

        System.out.println("How many times has it been fried? (#)");
        int timesFried = sc.nextInt();

        System.out.println("How many pats of butter are on top? (#)");
        int butter = sc.nextInt();

        System.out.println("Is it covered in chocolate? (y/n)");
        String chocolate = sc.next();

        System.out.println("Is it broccoli? (y/n)");
        String broccoli = sc.next();


        if (hasSpinach.equals ("y") || funnyName.equals("y")) {
            System.out.println("There is no way that'll get eaten.");
        }

        if (broccoli.equals("y") || cheese.equals("y")) {
            System.out.println("Nope, not going to happen");

        }

        if (chocolate.equals("y") && (butter > 0)) {
            System.out.println("Maybe there is a chance...");
        }

    }
}
