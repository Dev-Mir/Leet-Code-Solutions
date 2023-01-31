public class FindDuplicates {
    
    public static void main(String[] args) {
        
        String str = "Mir Hussain";
        str = str.toLowerCase();

        char[] chars = str.toCharArray();
        
        for(int i=0; i<chars.length; i++) {

            for(int j=i+1; j<chars.length; j++) {

                if(chars[i] == chars[j]){

                    System.out.print(chars[i]+" ");
                    break;

                }

            }

        }

       
    }

    
}
