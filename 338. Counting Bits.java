class Solution {
    public int[] countBits(int n) {
      int arr[] = new int[n+1];
      for(int i=0;i<=n;i++){
        arr[i]=i;
      }
      int result[] = new int[n+1];

      for(int i=0;i<=n;i++){
        int count = 0;
        String b = Integer.toBinaryString(arr[i]);
        for(int j = 0;j<b.length();j++){
            if(b.charAt(j)=='1'){
                count++;
            }
            result[i]=count;
        }
      }
      return result;
    }
}
