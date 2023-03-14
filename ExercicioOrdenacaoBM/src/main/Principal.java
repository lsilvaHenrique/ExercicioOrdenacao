package main;

import controller.Calculo;

public class Principal {

		public static void main (String[] args) {
			Calculo cal = new Calculo(); 
			int[] v = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
			System.out.println(" Bubble Sort ");
			cal.opBubble(v);
			 	for(int num : v) {
			      System.out.print(num + " ");
			 	}
			 	System.out.println(" "); 
			 	System.out.println("---------------------------------------"); 
			 	System.out.println(" Merge Sort ");
			cal.opMerge(12,v);      
				for(int num : v) {
			      System.out.print(num + " ");
			    }	 
		}
}
