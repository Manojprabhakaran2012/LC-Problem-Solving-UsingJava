class Solution {
    public int hammingWeight(int n) {
        String b = Integer.toBinaryString(n);
        char target = '1';
        int c = 0;

        for(int i=0;i<b.length();i++){
            if(b.charAt(i)==target){
                c++;
            }
        }
        return c;
    }
}
