package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task8 {
	private static final int SPEED = 335;
	public static void main(String[] args) {
		double time, distance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите время между выспышкой и ударом грома " +
				"(секунды):");
		time = scanner.nextDouble();
		distance = SPEED * time;
		System.out.println(
				"Растояние до места удара молнии равняется " + distance +
						" метров");
	}
}
