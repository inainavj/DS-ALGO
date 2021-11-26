class Solution {
    public int romanToInt(String s)
    {
        int i, sum=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
                {
                    sum=sum+1;
                }
            else if(s.charAt(i)=='V')
                {
                    sum=sum+5;
                }
            else if(s.charAt(i)=='X')
                {
                    sum=sum+10;
                }
            else if(s.charAt(i)=='L')
                {
                    sum=sum+50;
                }
            else if(s.charAt(i)=='C')
                {
                    sum=sum+100;
                }
           else if(s.charAt(i)=='D')
                {
                    sum=sum+500;
                }
            else if(s.charAt(i)=='M')
                {
                    sum=sum+1000;
                }
            
            
        }
        return sum;
        
    }
}
