package class18;

import java.util.Arrays;

public class QuickSortDemo {
    static void quickSort(int[] arr){hiddenMethod(arr, 0, arr.length - 1);}
    private static void hiddenMethod(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
    	if (low < high) {
        	int pivot = arr[high];
            int i = (low - 1);
            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;;
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
            int pi = (i + 1);
            hiddenMethod(arr, low, pi - 1);
            hiddenMethod(arr, pi + 1, high);
        }
	}
	public static void main(String[] args){
		int[] arr = {123, 23, 2, 656, 3, 8};      
        quickSort(arr);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}