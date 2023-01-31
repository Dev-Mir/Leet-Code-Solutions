// How do you count the occurrence of a given character in a string?

public class CountChar {

    public static void main(String[] args) {
        
        char c = 'a';
        int count = 0;
        String str = "Mir husasain";
        str = str.toLowerCase();

        int n = str.length();

        for(int i=0; i<n; i++) {

            if(str.charAt(i) == c){

                count++;

            }
        }

        System.out.println(c +" Occurred in "+count+" times");

    }

}