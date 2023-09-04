package view;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal_Ex_2 {

	public static void main(String[] args) {
		int [] vetor = {44, 43, 42, 41, 40, 39, 38};
		QuickSort QS = new QuickSort();
		
		QS.quickSort(vetor, 0, vetor.length-1);
		
		for (int i: vetor) {
		System.out.print(i+ " ");
		}
	}

}
