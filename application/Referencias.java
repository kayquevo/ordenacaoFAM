package application;

import java.util.Arrays;
import algoritmos.GnomeSort;
import algoritmos.Heapsort;
import algoritmos.Quicksort;

public class Referencias {

    public static void main(String[] args) {
        // Os testes reproduzem os exemplos de referência para garantir a fidelidade do algoritmo.

        // --------------------------------------------------------------------
        // Teste: Heapsort
        // --------------------------------------------------------------------
        System.out.println("Heapsort teste:");
        
        Heapsort sorter = new Heapsort();
        Integer[] arr = { 1, 4, 3, 2, 64, 3, 2, 4, 5, 5, 2, 12, 14, 5, 3, 0, -1 };
        String[] strarr = { "hope you find this helpful!", "wef", "rg", "q2rq2r", "avs", "erhijer0g", "ewofij", "gwe", "q", "random" };
        
        arr = sorter.heapsort(arr);
        strarr = sorter.heapsort(strarr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strarr));
        
        System.out.println("\n---------------------------------------\n");
        
        // --------------------------------------------------------------------
        // Teste: Quicksort
        // --------------------------------------------------------------------
        System.out.println("QuickSort teste:");

        Quicksort quickSort = new Quicksort();
        int quantidade = 10000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }
        
        long tempoInicial = System.currentTimeMillis();
        quickSort.sort(vetor);
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

        System.out.println("\n---------------------------------------\n");
        
        // --------------------------------------------------------------------
        // Nota: Árvore Binária
        // --------------------------------------------------------------------
        System.out.println("Arvore Binaria teste:");
        System.out.println("O autor não incluiu um método main com um conjunto de testes específico.");

        System.out.println("\n---------------------------------------\n");
        
        // --------------------------------------------------------------------
        // Teste: GnomeSort
        // --------------------------------------------------------------------
        System.out.println("GnomeSort teste:");

        int arrGnome[] = { 34, 2, 10, -9 };
        GnomeSort.gnomeSort(arrGnome, arrGnome.length);

        System.out.print("Sorted sequence after applying Gnome sort: ");
        System.out.println(Arrays.toString(arrGnome));
    }
}