class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;  
  temp=n;    
  while(n>0){    
   r=n%10;  //r=454%10=45
   sum=(sum*10)+r;  //sum=0*10+54  //sum=54*10 545
   n=n/10;     //n=454/10=45
 }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
