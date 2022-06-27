package ru.kolyandancer.common.tasks12;

public class Task6 {
	private static final double HEIGHT = 15;
	private static final double WIDTH = 20;
	public static void main(String[] args) {
		//double w , h;
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Введите ширину прямоугольника: ");
		//w = scanner.nextDouble();
		//System.out.println("Введите высоту прямоугольника: ");
		//h = scanner.nextDouble();
		System.out.println("Высота прямоугольника равняется " + HEIGHT +
				" Ширина прямоугольника равняется " + WIDTH);
		double p = 2 * (WIDTH + HEIGHT); // формула периметра P=2(w+h)
		System.out.println("Периметр прямоугольника равняется " + p);
		double s = WIDTH * HEIGHT; // формула площади S=w*h
		System.out.println("Площадь прямоугольника равняется " + s);
	}
}
