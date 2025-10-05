package application;

import java.util.Arrays;

import algoritmos.Heapsort;

public class Program {

	public static void main(String[] args) {
		Heapsort sorter = new Heapsort();
		
		Integer[] arr = {1, 4, 3, 2, 64, 3, 2, 4, 5, 5, 2, 12, 14, 5, 3, 0, -1};
		String[] strarr = {"hope you find this helpful!", "wef", "rg", "q2rq2r", "avs", "erhijer0g", "ewofij", "gwe", "q", "random"};
		
		arr = sorter.heapsort(arr);
		strarr = sorter.heapsort(strarr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(strarr));
	}
}
	
	