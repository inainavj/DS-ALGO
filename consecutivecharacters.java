class Solution {
    public int maxPower(String s) {
        int max=1;int currmax=1;
        for(int i=0;i<s.length();i++){
            
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1))
            {
              int j=i+2;
              currmax=2;
              while(s.charAt(i)==s.charAt(j))
              {
                  j++;
                  currmax++;
              }
              max= Math.max(max,currmax);
              
            }
           
           
        }
        return max;
       
    }
}
