class Solution {
    public boolean isPalindrome(String s) {
       if (s.length() == 0)
       return true;
       int start =0;
       int last = s.length() - 1;
       while(start <= last){
        int currFirst = s.charAt(start);
        int currLast = s.charAt(last);
        if(!Character.isLetterOrDigit(currFirst)){
            start++;
        } else if(!Character.isLetterOrDigit(currLast)){
            last--;
        }
        else{
            if(Character.toLowerCase(currFirst)!= Character.toLowerCase(currLast) ){
                return false;
            }
            start++;
            last--;
        }
       } 
       return true;
    }
}
