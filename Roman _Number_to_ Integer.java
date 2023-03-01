class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int ans=0;
           if(str.charAt(0)=='I')
           ans+=1;
           if(str.charAt(0)=='V')
           ans+=5;
           if(str.charAt(0)=='X')
           ans+=10;
           if(str.charAt(0)=='L')
           ans+=50;
           if(str.charAt(0)=='C')
           ans+=100;
           if(str.charAt(0)=='D')
           ans+=500;
           if(str.charAt(0)=='M')
           ans+=1000;
       for(int i=1;i<str.length();i++)
       {
           int prev=0;
           int next=0;
           if(str.charAt(i)=='M')
           next=1000;
           if(str.charAt(i)=='D')
           next=500;
           if(str.charAt(i)=='C')
           next=100;
           if(str.charAt(i)=='L')
           next=50;
           if(str.charAt(i)=='X')
           next=10;
           if(str.charAt(i)=='V')
           next=5;
           if(str.charAt(i)=='I')
           next=1;
            if(str.charAt(i-1)=='M')
           prev=1000;
           if(str.charAt(i-1)=='D')
           prev=500;
           if(str.charAt(i-1)=='C')
           prev=100;
           if(str.charAt(i-1)=='L')
           prev=50;
           if(str.charAt(i-1)=='X')
           prev=10;
           if(str.charAt(i-1)=='V')
           prev=5;
           if(str.charAt(i-1)=='I')
           prev=1;
           
           if(next>prev)
           ans=(ans-prev)+(next-prev);
           else
           ans+=next;
           }
         return ans;
           }
           
       }
      
    
