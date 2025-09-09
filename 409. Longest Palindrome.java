class Solution {
    public int longestPalindrome(String s) {
        int c = 0;
        Map<Character,Integer>map= new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1){
                c++;
            }
            else{
                c--;
            }
        }
        if(c>1){
            return s.length()-c+1;
        }
        return s.length();
    }
}
