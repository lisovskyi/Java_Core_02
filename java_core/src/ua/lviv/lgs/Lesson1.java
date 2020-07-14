package ua.lviv.lgs;

public class Lesson1 {
	public static void main(String[] args) {
		firstTask();
		secondTask();
		thirdTask();
	}
//-------------------------------------------------------------------------------------------------------------------------------------
	public static void firstTask() {		
		boolean b = true;
		char c = 'r';
		byte d = 120;
		short e = 1223;
		int a = 1;
		long f = 2332L;
		float g = 32.2F;
		double h = 22.1;
		System.out.println("First task");
		System.out.println("boolean: " + b  + "; char: " + c + "; byte: " + d + "; nshort: "+ e +"\nint: " + a +"; long: "+ f + "; float: " + g +"; double: " + h);
	}
//-------------------------------------------------------------------------------------------------------------------------------------
	public static void secondTask() {		
		System.out.println("\n\nSecond task");
		System.out.println("Boolean min value: " + Boolean.FALSE + "----- Boolean max value: " + Boolean.TRUE);
		System.out.println("Character min value: " + Character.MIN_VALUE + "----- Character max value: " + Character.MAX_VALUE);
		System.out.println("Byte min value: " + Byte.MIN_VALUE + "----- Byte max value: " + Byte.MAX_VALUE);
		System.out.println("Short min value: " + (Short.MIN_VALUE) + "----- Short max value: " + Short.MAX_VALUE);
		System.out.println("Integer min value: " + Integer.MIN_VALUE + "----- Integer max value: " + Integer.MAX_VALUE);
		System.out.println("Long min value: " + Long.MIN_VALUE + "----- Long max value: " + Long.MAX_VALUE);
		System.out.println("Float min value: " + Float.MIN_VALUE + "----- Float max value: " + Float.MAX_VALUE);
		System.out.println("Double min value: " + Double.MIN_VALUE + "----- Double max value: " + Double.MAX_VALUE);
	}
//-------------------------------------------------------------------------------------------------------------------------------------
	public static void thirdTask() {
		System.out.println("\n\nThird task");
		int[] arr = new int[10];
		int maxValue = 0;
		int minValue = 100;
		System.out.println("Массив 10 елементів випадкових чисел від 0 до 100:");
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("\nМаксимальне значення елементу массиву: " + maxValue);
		System.out.println("Мінімальне значення елементу массиву: " + minValue);
		System.out.println("123");
	}
}