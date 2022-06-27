package ru.kolyandancer.common.tasks12;

public class Task4 {
	public static void main(String[] args) {
		String hello = "Hello";
		String world = "World";
		System.out.print(hello);
		System.out.print('\u0020'); //u0020 - юникод пробельного символа!
		System.out.println(world);
		System.out.println(hello+'\u0020'+world); // вариант вывода в консоль
	}
}
