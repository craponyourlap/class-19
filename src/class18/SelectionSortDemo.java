package class18;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {123, 23, 2, 656, 3, 8};
		//move boundary of unsorted array one at a time
		for (int i = 0; i < arr.length - 1; i++) {
			// find the minimum element in unsorted array
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])min = j;
			}
			//swap minimum element with the first element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
