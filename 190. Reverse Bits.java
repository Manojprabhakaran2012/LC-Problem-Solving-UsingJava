class Solution {
    public int reverseBits(int n) {
       String b = Integer.toBinaryString(n);
       String pad = String.format("%32s",b).replace(' ','0');
       String rev = new StringBuilder(pad).reverse().toString();
       return(int) Long.parseLong(rev,2);
    }
}
