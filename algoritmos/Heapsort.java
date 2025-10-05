package algoritmos;

public class Heapsort {

    public <E extends Comparable<E>> E[] heapsort(E[] arr) {
        int heaplength = arr.length;

        for (int i = arr.length / 2; i > 0; i--) {
            arr = maxheapify(arr, i, heaplength);
        }

 
        for (int i = arr.length - 1; i >= 0; i--) {
            E max = arr[0];
            arr[0] = arr[i];
            arr[i] = max;

            heaplength--;
            arr = maxheapify(arr, 1, heaplength);
        }

        return arr;
    }

    private <E extends Comparable<E>> E[] maxheapify(E[] arr, Integer node, Integer heaplength) {
        Integer left = node * 2;
        Integer right = node * 2 + 1;
        Integer largest = node;

        if (left.compareTo(heaplength) <= 0 && arr[left - 1].compareTo(arr[node - 1]) >= 0) {
            largest = left;
        }
        if (right.compareTo(heaplength) <= 0 && arr[right - 1].compareTo(arr[largest - 1]) >= 0) {
            largest = right;
        }
        if (largest != node) {
            E temp = arr[node - 1];
            arr[node - 1] = arr[largest - 1];
            arr[largest - 1] = temp;

            maxheapify(arr, largest, heaplength);
        }

        return arr;
    }
}