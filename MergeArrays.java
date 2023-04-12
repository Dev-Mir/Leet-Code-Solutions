
/*
 * Problem 2:
 *
 * In this problem, given two sorted arrays, you have to implement the 
 * int[] mergeArrays(int[] arr1, int[] arr2) method, which returns an array 
 * consisting of all elements of both arrays in a sorted way 
 *
 */


class P {

    public void mergeArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];

        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }

        int k = 0;
        for (int i = 0; i < m; i++) {
            arr3[n + k] = arr2[i];
            k++;
        }

        // sorting arr3

        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                int tmp = 0;
                if (arr3[i] > arr3[j]) {
                    tmp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = tmp;
                }
            }
            // prints the sorted element of the array
            System.out.print(arr3[i] + " ");
        }
    }
}

public class MergeArrays {

    public static void main(String[] args) {

        P obj = new P();

        int arr[] = { 1, 3, 4, 5 };
        int arr1[] = { 2, 6, 7, 8 };

        obj.mergeArrays(arr, arr1);

    }

}