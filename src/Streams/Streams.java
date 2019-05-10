package Streams;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) {

		List<String> bingo = Arrays.asList(
				"d20", "D40",
				"h28", "h42",
				"A12", "a48", "A49",
				"C6");


		for(String number : bingo) {
			number = number.toUpperCase();
			if(number.startsWith("A"))
				System.out.println(number);
		}








		bingo.forEach(number -> {
			number = number.toUpperCase();
			if(number.startsWith("A"))
				System.out.println(number);
		});








		bingo.stream()
				.map(number -> number.toUpperCase())
				.filter(number -> number.startsWith("A"))
				.forEach(System.out::println);
	}
}
