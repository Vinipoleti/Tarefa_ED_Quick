package view;

import br.edu.fateczl.ordenacao.bublesort.BubbleSort;
import br.edu.fateczl.ordenacao.mergesort.MergeSort;
import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal_Ex_6 {

	public static void main(String[] args) {
		
		BubbleSort BS = new BubbleSort();
		MergeSort MS = new MergeSort();
		QuickSort QS = new QuickSort();
		
		int [] vetor = new int [1500];
		
		for (int i=0; i<1500;i++) {
			vetor[i]= (int) (Math.random()*1500)+1;
		}
		int tamanho = vetor.length -1;
		
		double inicialBS = System.nanoTime();
		BS.bubblesort(vetor);
		double fimBS = System.nanoTime();
		double TempoBS= (fimBS - inicialBS)*Math.pow(10, 9);
		for (int i: vetor) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		for (int i=0; i<1500;i++) {
			vetor[i]= (int) (Math.random()*1500)+1;
		}
	
		double inicialMS = System.nanoTime();
		MS.Merge(vetor, 0, tamanho);
		double fimMS = System.nanoTime();
		double TempoMS= (fimMS - inicialMS)*Math.pow(10, 9);
		for (int i: vetor) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		for (int i=0; i<1500;i++) {
			vetor[i]= (int) (Math.random()*1500)+1;
		}
		double inicialQS = System.nanoTime();
		QS.quickSort(vetor, 0, tamanho);
		double fimQS = System.nanoTime();
		double TempoQS= (fimQS - inicialQS)*Math.pow(10, 9);
		for (int i: vetor) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		System.out.println("Tempo BS: " + TempoBS);
		System.out.println("Tempo MS: " + TempoMS);
		System.out.println("Tempo QS: " + TempoQS);
	}

}

