class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int[] output =new int[a.length];
        int count,i,j;
        for(i=0;i<a.length; i++)
        {
            count=0;
            for(j=0; j<a.length; j++)
            {
                if(a[j]<a[i])
                {
                    count++;
                }
            }
            output[i]=count;
        }
      return output;  
    }
}
