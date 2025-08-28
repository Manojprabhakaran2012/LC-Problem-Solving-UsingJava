class Solution {
    public String toHex(int num) {
        if(num==0)return "0";

        char[] h = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();
        long n = num & 0xFFFFFFFFL;

        while(n>0){
            int rem = (int)(n%16);
            sb.append(h[rem]);
            n/=16;
        }

        return sb.reverse().toString().toLowerCase();
    }
}
