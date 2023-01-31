// How is a bubble sort algorithm implemented?


public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {99,3,6,8,2,9,12};

        for(int i=0; i<array.length-1; i++){

            for(int j=0; j<array.length-i-1; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        
        }


        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }

}