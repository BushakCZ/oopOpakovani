package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pet> zvirata = new ArrayList();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("Spousti se program");
        menu();
    }

    private static void menu() {
        System.out.println("Zadejte 1 pro pridani zviratka");
        System.out.println("Zadejte 2 pro odebrani zviratka");
        System.out.println("Zadejte 3 pro vypis");
        System.out.println("Zadejte 4 pro ukonceni programu");
        int num = Integer.parseInt(sc.nextLine());
        switch (num) {
            case 1 -> add();
            case 2 -> rem();
            case 3 -> wri();
            case 4 -> end();
            default -> run();
        }

    }

    private static void add() {
        System.out.println("Zadej jmeno zvirete: ");
        String name = sc.nextLine();
        System.out.println("Zadej vek: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Zadej pohlavi: ");
        String gender = sc.nextLine();
        System.out.println("Zadej druh: ");
        String type = sc.nextLine();
        System.out.println("Zadej pocet nohou");
        int numberOfLegs = Integer.parseInt(sc.nextLine());
        zvirata.add(new Pet(name, age, gender, type, numberOfLegs));
        menu();
    }

    private static void rem() {
        System.out.println("Zadej jmeno zvirete, ktere chces odebrat: ");
        String name = sc.nextLine();
        zvirata.removeIf(pet -> pet.getName().equals(name));
        menu();
    }

    private static void wri() {
        System.out.println(zvirata);
        menu();
    }

    private static void end(){
        System.out.println("Program ukoncen");
    }

}
