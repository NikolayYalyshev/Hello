package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float n;
		System.out.println("Введите число n");
		n = in.nextFloat();
		int a = Math.round(n);
		System.out.println("Результат округления числа " + n + " равняется " + a);
	}
}
