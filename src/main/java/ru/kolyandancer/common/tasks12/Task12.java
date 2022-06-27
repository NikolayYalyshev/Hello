package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число первоклассников:");
		int countStudents = scanner.nextInt();
		countFood(100, countStudents);
		countFood(60, countStudents);
		countFood(1, countStudents);
	}
	private static void countFood(int dryshchRate, int studentsCount) {
		if (dryshchRate < 0 || dryshchRate > 100) {
			System.out.println("Неверное значение dryshchRate");
			return;
		}
		int dryshchCount =
				(int) Math.round(studentsCount * dryshchRate / 100.0);
		int normalCount = studentsCount - dryshchCount;
		int cakeCount = normalCount + dryshchCount * 2;
		double milkLiters = dryshchCount * 0.2;
		int milkPackageCount = (int) Math.ceil(milkLiters / 0.9);
		System.out.println(
				"Если в школе " + studentsCount + " первоклассников , из них " + dryshchRate +
						"%" + " у которых вес меньше 30 кг, то " +
						"необходимо " + cakeCount + " пирожков и " +
						milkPackageCount + " упаковок" + " молока купить");
	}
}

