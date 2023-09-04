package view;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal_Ex_3 {

	public static void main(String[] args) {
		int [] vetor = {31, 32, 33, 34, 99, 98, 97, 96};
		QuickSort QS = new QuickSort();
		
		QS.quickSort(vetor, 0, vetor.length-1);
		
		for (int i: vetor) {
		System.out.print(i+ " ");
		}
	}

}
