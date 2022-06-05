package ru.kolyandancer;

public class Main {

    public static void main(String[] args) {
        String[] guests  =new  String[5];
        guests[0] = "nikola";
        guests[1] = "maxon";
        guests[2] = "vikos";
        guests[3] = "elenas";
        guests[4] = "ilyas";
        for (int i=0; i < guests.length; i++) {
            String name = guests[i];
            if (name.endsWith("s")) {
                System.out.println(" Hello, " + name);
            }
        }

    }
}