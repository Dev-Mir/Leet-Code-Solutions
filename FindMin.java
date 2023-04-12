/*
 * Problem 5:
 * 
 * In this problem, you have to implement the int findMinimum(int[] arr) method, 
 * which will traverse the whole array and find the smallest number in the array
 * 
 */



class A {

    void findMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];

            }
        }
        System.out.print(min);
    }

}

public class FindMin {

    public static void main(String[] args) {
        A obj = new A();

        int[] arr = { 9, 2, 3, 6 };
        obj.findMin(arr);
    }
}
