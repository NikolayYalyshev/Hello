package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Введите число N");
		n = in.nextInt();
		int n2 = n;
		//int q = n / 100;
		int sum = 0;
		while (n2 > 0) {
			int di = n2 % 10;
			sum += di;
			n2 /= 10;
		}
		//int w = n % 10;
		//int e = n / 10;
		//int eS = e % 10;
		//int rS = q + w + eS;
		System.out.println("Сумма цифр числа " + n + " равняется " + sum);
	}
}
