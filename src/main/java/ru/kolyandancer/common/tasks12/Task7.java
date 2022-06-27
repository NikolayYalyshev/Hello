package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		int a;
		double b , s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите сумму вклада: ");
		a = scanner.nextInt();
		System.out.println("Введите годовую ставку для суммы вклада:");
		b = scanner.nextDouble();
		s = ( ( a / 100 ) * b * 2) + a; // формула рачета вклада на 2 года
		System.out.println("Сумма вклада за два года равняется " + s);
		// более сложный вариант решения, с задаваемым числом дней для вклада
		int z , c;
		double x , n;
		final int v = 365;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму вклада: ");
		z = sc.nextInt();
		System.out.println("Введите годовую ставку для суммы вклада:");
		x = sc.nextDouble();
		System.out.println("Введите количество дней для вклада: ");
		c = sc.nextInt();
		n = (((z*x*c)/v)/100)+z; // формула расчета вклада с задаваемым
		// числом дней
		System.out.println("Сумма вклада за два года равняется " + n);
	}
}
