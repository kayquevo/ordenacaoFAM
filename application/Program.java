package application;

import java.util.Arrays;

import algoritmos.ArvoreBinaria;
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
        
        
        // Teste com Arvore Binaria
        System.out.println("\nInserindo na Árvore Binária:");
        ArvoreBinaria arvore = new ArvoreBinaria();
        for (Integer valor : vetorOriginal) {
            arvore.inserir(valor);
        }
        
        System.out.print("\nÁrvore Binária (em ordem): ");
        arvore.emOrdem();
        System.out.println();
        
        
        
    }
}