package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		double x, a , b, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		x = scanner.nextDouble();
		System.out.println("Введите число:");
		a = scanner.nextDouble();
		System.out.println("Введите число:");
		b = scanner.nextDouble();
		System.out.println("Введите число:");
		y = scanner.nextDouble();
		int count = 0;
		if (x == (int) x) {
			System.out.println("Число " + x + " является целым");
		} else {
			System.out.println("Число " + x + " не является целым");
		}
		if (a == (int) a) {
			System.out.println("Число " + a + " является целым");
		} else {
			System.out.println("Число " + a + " не является целым");
		}
		if (b == (int) b) {
			System.out.println("Число " + b + " является целым");
		} else {
			System.out.println("Число " + b + " не является целым");
		}
		if (y == (int) y) {
			System.out.println("Число " + y + " является целым");
		} else {
			System.out.println("Число " + y + " не является целым");
		}
	}
}