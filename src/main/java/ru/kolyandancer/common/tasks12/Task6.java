package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		double w , h;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ширину прямоугольника: ");
		w = scanner.nextDouble();
		System.out.println("Введите высоту прямоугольника: ");
		h = scanner.nextDouble();
		double p = 2 * (w + h); // формула периметра P=2(w+h)
		System.out.println("Периметр прямоугольника равняется " + p);
		double s = w * h; // формула площади S=w*h
		System.out.println("Площадь прямоугольника равняется " + s);
	}
}
