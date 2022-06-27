package ru.kolyandancer.common.tasks12;

public class Task5 {
	private static final double RADIUS = 7;
	public static void main(String[] args) {
		final double s = Math.PI * (RADIUS *RADIUS); // Формула S = π*(r*r)
		System.out.println("Площадь круга с радуисом " + RADIUS + " " +
				"равняется " + s );
		final double c = 2 * Math.PI  * RADIUS; // формула С = 2πr
		System.out.println("Длина круга с радуисом " + RADIUS + " " +
				"равняется " + c);
	}

}
