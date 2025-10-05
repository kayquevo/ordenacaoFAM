package application;

import java.util.Arrays;

import algoritmos.Heapsort;
import algoritmos.Quicksort;

public class Program {

    public static void main(String[] args) {
        
        Integer[] vetorOriginal = {11, 8, 4, 13, 1, 5, 20, 7};
        
        System.out.println("Vetor Original: " + Arrays.toString(vetorOriginal));
        System.out.println("-------------------------------------------------");

        // Teste com Heapsort
        Heapsort heapsorter = new Heapsort();
        Integer[] vetorParaHeapsort = Arrays.copyOf(vetorOriginal, vetorOriginal.length); 
        heapsorter.heapsort(vetorParaHeapsort);
        System.out.println("Heapsort: \t" + Arrays.toString(vetorParaHeapsort));
        
        // Teste com Quicksort
        Quicksort quicksorter = new Quicksort();
        int[] vetorParaQuicksort = Arrays.stream(vetorOriginal).mapToInt(Integer::intValue).toArray();
        quicksorter.sort(vetorParaQuicksort);
        System.out.println("Quicksort: \t" + Arrays.toString(vetorParaQuicksort));

        
    }
}