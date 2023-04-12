
/*
 * Problem 1:
 * 
 * In this problem, you have to implement the
 * int [] removeEven (int[] arr) method, which removes all the even elements
 * from the array and returns back updated array.
 * 
 */



class A {

    public void removeEven(int[] arr) {

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                newArr[i] = arr[i];
                System.out.print(newArr[i] + " ");
            }

        }

    }

}

public class RemoveEven {

    public static void main(String[] args) {

        A obj = new A();

        int arr[] = { 1, 2, 4, 5, 10, 6, 3 };

        obj.removeEven(arr);

    }

}