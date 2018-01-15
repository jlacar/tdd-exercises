package com.codemanship.codelab.tdd.romannumerals;

public class RomanNumeralConverter {

	String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	int[] limits = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public String convert(int number) {

		if (number >= 5000 || number < 1) {
			throw new IllegalArgumentException("Number is out of range (1-4999)");
		}
		
		StringBuilder sb = new StringBuilder();

		int n = number;
		
		for (int i = 0; i < limits.length; i++) {
			while (n >= limits[i]) {
				sb.append(letters[i]);
				n -= limits[i];
			}
		}
		
//		while (n >= limits[1]) {
//			sb.append(letters[1]);
//			n -= limits[1];
//		}
//		
//		while (n >= limits[2]) {
//			sb.append(letters[2]);
//			n -= limits[2];
//		}
//
//		while (n >= limits[3]) {
//			sb.append(letters[3]);
//			n -= limits[3];
//		}
//
//		while (n >= limits[4]) {
//			sb.append(letters[4]);
//			n -= limits[4];
//		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		show(4999);
		show(4000);
		show(4100);
		show(4900);
		show(4800);
		show(4700);
		show(4600);
		show(2);
		show(4);
		show(9);
		show(10);
		show(13);
		show(15);
	}
	
	private static RomanNumeralConverter it = new RomanNumeralConverter();
	
	private static void show(int n) {
		System.out.printf("%d - %s%n", n, it.convert(n));
	}
}
