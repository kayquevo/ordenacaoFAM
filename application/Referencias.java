package application;

import java.util.Arrays;

import algoritmos.Heapsort;
import algoritmos.Quicksort;

public class Referencias {
	public static void main(String[] args) {
		//Os testes reproduzem os exemplos de referência para garantir a fidelidade do algoritmo.
		
		Heapsort sorter = new Heapsort();
		
		Integer[] arr = {1, 4, 3, 2, 64, 3, 2, 4, 5, 5, 2, 12, 14, 5, 3, 0, -1};
		String[] strarr = {"hope you find this helpful!", "wef", "rg", "q2rq2r", "avs", "erhijer0g", "ewofij", "gwe", "q", "random"};
		
		arr = sorter.heapsort(arr);
		strarr = sorter.heapsort(strarr);
		
		
		System.out.println("Heapsort teste: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(strarr));
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		
		
		//
		
		
		Quicksort quickSort = new Quicksort();

		int quantidade = 10000;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
		    vetor[i] = (int) (Math.random() * quantidade);
		}

		long tempoInicial = System.currentTimeMillis();

		quickSort.sort(vetor); 

		long tempoFinal = System.currentTimeMillis();
		
		System.out.println("QuickSort teste: ");
		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}
}
