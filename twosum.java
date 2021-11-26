class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output=new int[2];
        int i,j, sum=0,index=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(i!=j) {
                    sum=nums[i]+nums[j];
                    if(sum== target)
                    {
                      output[index] = i;
                        index++;
                        output[index] =j;
                        return output;
                    }
                }
                
            }
            
        }
      return output;  
    }
}
