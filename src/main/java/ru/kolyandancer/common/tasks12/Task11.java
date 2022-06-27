package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		long seconds;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Сколько осталось секунд до нового года:");
		seconds = scanner.nextLong();
		long sec = seconds % 60;
		seconds /= 60;
		long minutes = seconds % 60;
		seconds /= 60;
		long hours = seconds % 24;
		seconds /= 24;
		long days = seconds;
		System.out.println(
				days + " Day " + hours + " Hour " + minutes + " Minute " + sec +
						" Seconds");
	}
}
