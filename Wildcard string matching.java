class Solution{
    boolean match(String wild, String pattern)
    {
       return solve(wild,pattern,0,0); 
    }
    
    boolean solve(String w ,String p, int i,int j)
    {
       if(j==p.length()&& i==w.length())
       return true;
       if(j!=p.length()&& i==w.length())
       return false;
       if(j==p.length() && i!=w.length())
       {
           while(i<w.length())   //if we are pattern exhausted but wildcard still
           {                      //then that means there must be only * left otherwise return false 
               if(w.charAt(i)!='*')  //else no more charcter is added 
               return false;
               i++;
           }
           return true;
       }
      
       if(w.charAt(i)==p.charAt(j) || w.charAt(i)=='?')
       {
           return solve(w,p,i+1,j+1); 
       }
       if(w.charAt(i)=='*')
       {
             return solve(w,p,i+1,j)||solve(w,p,i,j+1);  //either star will be empty or matches a character 
       }
       return false;
    }
}
//Observe that when the iterator of the wild string (it1) has the value '*', 
//then we can either increase the it1 or it2(iterator of the pattern string) 
//because we can either give the '*' no character or the character at the postion
//of it2 and continue giving. And when both of them reaches at the end of their 
//corresponding string, we can say that we can achieve pattern from wild.
