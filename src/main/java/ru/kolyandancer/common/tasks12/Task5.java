package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите радиус круга: ");
		double radius = scanner.nextDouble();
		double s = Math.PI * (radius *radius); // Формула S = π*(r*r)
		System.out.println("Площадь круга с радуисом " + radius + " " +
				"равняется " + s );
		double с = 2 * Math.PI  * radius; // формула С = 2πr
		System.out.println("Длина круга с радуисом " + radius + " " +
				"равняется " + с);
	}
}
