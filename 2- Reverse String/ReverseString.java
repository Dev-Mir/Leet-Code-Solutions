class Solution {
    public void reverseString(char[] s) {
        
        int first_index = 0;
        int last_index = s.length-1;
        
        while(first_index <= last_index){
            
            char temp = s[first_index];
            s[first_index] = s[last_index];
            s[last_index] =  temp;
            
            first_index++;
            last_index--;
            
        }
        
    }
}
