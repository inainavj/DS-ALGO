#include <stdio.h>

    int removeDuplicates(int* nums, int numsSize)
{
    int i,k;
    for(i=0;i<numsSize;i++)
    {
        for(k=0;k<numsSize;k++)
        {
            if(k==i)
            { 
            continue;
            }
            
            else 
            {
                if(nums[i]==nums[k])
               {
                    for( int j=k;j<numsSize-1;j++)
                    {
                      nums[j]=nums[j+1]; 
                        
                    }
                    numsSize--;
                  
                }
                for(i=0;i<numsSize;i++)
                {
                  printf("%d",nums[i]);
               }
            }
        }
    }
        return numsSize;
}
        
    

    
