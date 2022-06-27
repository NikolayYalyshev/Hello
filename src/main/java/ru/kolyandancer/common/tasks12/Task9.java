package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		double x;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Введите число:");
			x = scanner.nextDouble();
			if (x == (int) x) {
				System.out.println("Число " + x + " является целым");
			} else {
				System.out.println("Число " + x + " не является целым");
			}
		}
	}
}