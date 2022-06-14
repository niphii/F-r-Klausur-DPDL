package BubbleSort_Übung;

public class bubblesort {

	public static void main(String[] args) {
		
		int[] array = {34, 65, 43, -23, 8, 454, 34, 2, -9, 7, 6, 4, 12, 234, 54, 23, 76, 8, 98, 32};
		sortBubble(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static int[] sortBubble(int [] array) {
		
		int temp = 0;
		
		for (int j = 0; j < array.length; j++) {
			boolean swapped = false;
			
			for (int i = 1; i < array.length; i++) {
			
			if (array[i-1] > array[i]) {
				
				swapped = true;
				temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
		}
		
			}
			if (swapped = false) {
				break;
			}
		}
		return (array);
	}
}
