package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task7 {
	private static final double YEARS = 2;
	
	public static void main(String[] args) {
		//Предположим, что капитализация вклада отсутствует. Проценты
		// выплачиваются единажды в конце срока (2 года)
		int initialSum;
		double rate, finalSum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите сумму вклада: ");
		initialSum = scanner.nextInt();
		System.out.println("Введите годовую ставку для суммы вклада:");
		rate = scanner.nextDouble();
		finalSum = (initialSum * (rate / 100) * YEARS) + initialSum; //
		// формула
		// расчета вклада на 2 года
		System.out.println("Сумма вклада за два года равняется " + finalSum);
		
		System.out.println("Более сложный вариант решения, с задаваемым" +
				" числом дней для вклада");
		int z, c;
		double x, n;
		final int v = 365;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму вклада: ");
		z = sc.nextInt();
		System.out.println("Введите годовую ставку для суммы вклада:");
		x = sc.nextDouble();
		System.out.println("Введите количество дней для вклада: ");
		c = sc.nextInt();
		n = (((z * x * c) / v) / 100) +
				z; // формула расчета вклада с задаваемым
		// числом дней
		System.out.println("Сумма вклада за два года равняется " + n);
	}
}
