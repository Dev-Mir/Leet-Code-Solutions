//Reverse an array in place in Java

public class ReverseArray {
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int n = array.length-1;

        for(int i=n; i>=0; i--) {

            System.out.print(array[i]+" ");

        }

    }

}
