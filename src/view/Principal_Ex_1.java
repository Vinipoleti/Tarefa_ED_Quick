package view;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal_Ex_1 {

	public static void main(String[] args) {
		int [] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		QuickSort QS = new QuickSort();
		
		QS.quickSort(vetor, 0, vetor.length-1);
		
		for (int i: vetor) {
		System.out.print(i+ " ");
		}
	}

}
