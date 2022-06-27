package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		int a, b, f, z, v;
		double c, d, e, x, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число первоклассников:");
		a = scanner.nextInt();
		b = a;
	    c = 0.2;
		d = 0.9;
		f = b + b;
		e = (c * a) / d;
		System.out.println("Если в школе " + a + " первокласников, то " +
				"необходимо "+ f + " пирожков и " + Math.ceil(e) + " упаковок молока купить");
		z = (b + b)/100*60;
		x = ((c * a) / d)/100*60;
		System.out.println("Если в школе " + a + " , из них 60% первокласников, то " +
				"необходимо "+ z + " пирожков и " + Math.ceil(x) + " упаковок" +
				" молока купить");
		v = (b + b)/100;
		n = ((c * a) / d)/100;
		System.out.println("Если в школе " + a + " , из них 1% " +
				"первокласников, то " +
				"необходимо "+ v + " пирожков и " + Math.ceil(n) + " упаковок" +
				" молока купить");
	}
}
