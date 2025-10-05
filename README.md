### Heapsort

<p> Heapsort é um algoritmo de ordenação eficiente baseado no uso de estruturas de dados denominadas heaps (máxima/mínima). Um heap é uma estrutura de dados baseada em árvore que satisfaz a propriedade heap – ou seja, para um heap máximo, a chave de qualquer nó é menor ou igual à chave de seu pai (se tiver um pai).

Essa propriedade pode ser aproveitada para acessar o elemento máximo no heap em tempo O(logn) usando o método maxHeapify. Realizamos esta operação n vezes, cada vez movendo o elemento máximo no heap para o topo do heap e extraindo-o do heap para um array ordenado. Assim, após n iterações teremos uma versão ordenada do array de entrada.

O algoritmo exige que uma estrutura de dados heap seja construída primeiro. O algoritmo não é estável, o que significa que ao comparar objetos com a mesma chave, a ordenação original não será preservada.

Este algoritmo é executado em tempo O(nlogn) e requer espaço adicional O(1) [O(n) incluindo o espaço necessário para armazenar os dados de entrada], uma vez que todas as operações são executadas inteiramente in loco.

A complexidade de tempo melhor, pior e média do Heapsort é O(nlogn). Embora heapsort tenha uma complexidade de pior caso melhor do que o quicksort, quando bem implementado, o quicksort é executado mais rapidamente na prática. Heapsort é um algoritmo baseado em comparação, portanto, pode ser usado para conjuntos de dados não numéricos, na medida em que alguma relação (propriedade de heap) possa ser definida sobre os elementos. [1]

Uma implementação em Java é apresentada abaixo :
<p/>

    import java.util.Arrays;

    public class Heapsort {

	public static void main(String[] args) {
		//array de teste
		Integer[] arr = {1, 4, 3, 2, 64, 3, 2, 4, 5, 5, 2, 12, 14, 5, 3, 0, -1};
		String[] strarr = {"hope you find this helpful!", "wef", "rg", "q2rq2r", "avs", "erhijer0g", "ewofij", "gwe", "q", "random"};
		
		arr = heapsort(arr);
		strarr = heapsort(strarr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(strarr));
	}
	
	//O(nlogn) TEMPO, O(1) ESPAÇO, NÃO ESTÁVEL
	public static <E extends Comparable<E>> E[] heapsort(E[] arr){
		int heaplength = arr.length;
		for(int i = arr.length/2; i>0;i--){
			arr = maxheapify(arr, i, heaplength);
		}
		
		for(int i=arr.length-1;i>=0;i--){
			E max = arr[0];
			arr[0] = arr[i];
			arr[i] = max;
			heaplength--;
			arr = maxheapify(arr, 1, heaplength);
		}
		
		return arr;
	}
	
	//Cria maxheap a partir de um array
	public static <E extends Comparable<E>> E[] maxheapify(E[] arr, Integer node, Integer heaplength){
		Integer left = node*2;
		Integer right = node*2+1;
		Integer largest = node;
		
		if(left.compareTo(heaplength) <=0 && arr[left-1].compareTo(arr[node-1]) >= 0){
			largest = left;
		}
		if(right.compareTo(heaplength) <= 0 && arr[right-1].compareTo(arr[largest-1]) >= 0){
			largest = right;
		}	
		if(largest != node){
			E temp = arr[node-1];
			arr[node-1] = arr[largest-1];
			arr[largest-1] = temp;
			maxheapify(arr, largest, heaplength);
		}
		return arr;
	}
	}

### Referencias

<p>
&nbsp; &nbsp; [1] Mbah R. Algoritmos de Ordenação Explicados – com Exemplos em Python, Java e C++. [publicação online]; 2020. [acesso em 05 out 2025]. Disponível em: <a href="https://www.freecodecamp.org/portuguese/news/algoritmos-de-ordenacao-explicados-com-exemplos-em-python-java-e-c/">https://www.freecodecamp.org/portuguese/news/algoritmos-de-ordenacao-explicados-com-exemplos-em-python-java-e-c/</a>
</p>
