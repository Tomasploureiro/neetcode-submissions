class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        HashMap<Character, Integer> ms = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mt = new HashMap<Character, Integer>();

        for(char c : cs){
            if(ms.containsKey(c)){
                ms.put(c, ms.get(c) + 1);
            } else{
                ms.put(c , 1);
            }
        }

        for(char c : ct){
            if(mt.containsKey(c)){
                mt.put(c, mt.get(c) + 1);
            } else{
                mt.put(c , 1);
            }
        }

        if( mt.equals(ms)){
            return true;
        } 

        return false;
    }
}
