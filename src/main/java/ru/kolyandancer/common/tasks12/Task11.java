package ru.kolyandancer.common.tasks12;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		long seconds;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Сколько осталось секунд до нового года:");
		seconds = scanner.nextLong();
		long sec = seconds % 60;
		long minutes = seconds % 3600 / 60;
		long hours = seconds % 86400 / 3600;
		long days = seconds / 86400;
		System.out.println(
				 days + " Day " +  hours + " Hour " + minutes + " Minute " + sec + " Seconds" );
	}
}
