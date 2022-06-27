package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		System.out.println("Введите число Х");
		x = in.nextInt();
		System.out.println("Введите число Y");
		y = in.nextInt();
		int c, d;
		c = x / y;
		d = x % y;
		double e;
		e = Math.sqrt(x);
		System.out.println("Результат деления: " + c);
		System.out.println("Остаток от деления: " + d);
		System.out.println("Квадратный корень числа Х: " + e);
	}
}
