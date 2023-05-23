package day17.com.ict.edu2;

import java.util.Arrays;
import java.util.Collections;

public class Debug_sort {
	public static void main(String[] args) {
		Integer[] array = {49, 35, 71, 13, 9, 99};
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("["+array[i]+"]");
		}
	}
}
