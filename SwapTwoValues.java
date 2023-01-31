//swap two numbers without using the third variable 

public class SwapTwoValues {
    
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        System.out.println(a + " "+ b);

        a = a+b;
        b = a-b;
        a = a-b;  

        System.out.println(a + " "+ b);

    }

}
