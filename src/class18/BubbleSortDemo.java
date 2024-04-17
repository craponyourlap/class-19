package class18;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {123, 23, 2, 656, 3, 8};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = 1; j < arr.length - i; j++) {
//				if (arr[j-1] > arr[j]) {
//					int temp = arr[j-1];
//					arr[j-1] = arr[j];
//					arr[j] = temp;
//				}
//				System.out.println(Arrays.toString(arr));
//			}
//		}
	}

}
