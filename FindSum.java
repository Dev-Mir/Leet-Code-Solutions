/*
 * Problem 3:
 * 
 * In this problem, you have to implement the int[] findSum(int[] arr, int n) method, 
 * which will take a number n, and an array arr as input and returns an array of two integers 
 * that add up to n in an array. You are required to return only one such pair. If no such pair 
 * is found then simply return the array
 *
 */



class A {
    void findSum(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == n) {

                    System.out.print(arr[i] + "  " + arr[j]);
                    return;

                }

            }
        }

    }
}

public class FindSum {

    public static void main(String[] args) {

        A obj = new A();

        int[] aa = { 1, 21, 3, 14, 5, 6, 0, 7, 6 };
        int num = 27;
        obj.findSum(aa, num);

    }
}
