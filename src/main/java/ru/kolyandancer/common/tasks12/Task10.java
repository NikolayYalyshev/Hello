package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		int height, weight;
		int a = 110;
		int b, c, d;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите свой рост:");
		height = scanner.nextInt();
		System.out.println("Введите свой вес:");
		weight = scanner.nextInt();
		b = height - a;
		if (b < weight) {
			c = weight - b;
			System.out.println("Надо сбросить "+c+ " килограмм, для " +
					"идеального" +
					" веса");
		}
		else {
			d = b - weight;
			System.out.println("Надо набрать "+d+ " килограмм, для идеального" +
					" веса");
		}
	}
	
}
