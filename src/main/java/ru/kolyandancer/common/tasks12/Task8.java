package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
	final int speed = 340; // скорость звука
		double time ,  distance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите время между выспышкой и ударом грома:");
		time = scanner.nextDouble();
		distance = speed * time;
		System.out.println("Растояние до места удара молнии равняется " + distance + " метров");
	}
}
