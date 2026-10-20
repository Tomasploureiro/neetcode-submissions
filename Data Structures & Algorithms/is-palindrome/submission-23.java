class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        char[] cs = s.toCharArray();

        for(int i = 0, j = 0; i <= (cs.length - 1) - j; i++, j++){
            

            while(!Character.isLetterOrDigit(cs[i])){
                if(i + 1 == cs.length){
                    return true;
                } 
                i++;
            }
            while(!Character.isLetterOrDigit(cs[(cs.length - 1) - j])){
                j++;
            }
            if(cs[i] != cs[(cs.length - 1) - j]){
                return false;
            }
        }
        return true;
    }
}
