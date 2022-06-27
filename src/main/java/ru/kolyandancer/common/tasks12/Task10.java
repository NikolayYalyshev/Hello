package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task10 {
	private static final int COEF = 110;
	
	public static void main(String[] args) {
		int height, weight;
		int idealWeight, delta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите свой рост:");
		height = scanner.nextInt();
		System.out.println("Введите свой вес:");
		weight = scanner.nextInt();
		idealWeight = height - COEF;
		if (idealWeight < weight) {
			delta = weight - idealWeight;
			System.out.println("Надо сбросить " + delta + " килограмм, для " +
					"идеального" + " веса");
		} else if (idealWeight > weight) {
			delta = idealWeight - weight;
			System.out.println(
					"Надо набрать " + delta + " килограмм, для идеального" +
							" веса");
		} else {
			System.out.println("Ты красавчик, у тебя идеальный вес!");
		}
	}
	
}
