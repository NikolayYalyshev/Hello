package ru.kolyandancer;

public class startCriete {
    public static void main(String[] args) {
        String[] guests = new String[5];
        guests[0] = "nikola";
        guests[1] = "vikos";
        guests[2] = "maxon";
        guests[3] = "ilyas";
        guests[4] = "lenos";
        for (int i=0; i < guests.length; i++) {
            String name = guests[i];
            if (name.endsWith("s")) {
                System.out.println("Hello " + name);
            }
        }

    }
}
