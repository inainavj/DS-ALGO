class Solution {
    public boolean isAnagram(String s, String t) {
        int i,j;
        int [] src=new int[26];
        int [] target=new int[26];
        if(s.length()==t.length())
        {
          for(i=0;i<s.length();i++)
          {
              src[s.charAt(i) - 'a']++;
          }
            
            for(i=0;i<t.length();i++)
          {
              target[t.charAt(i) - 'a']++;
          }
            
            if(Arrays.equals(src, target)){
                return true;
            }
        }
        return false;
    }
}
