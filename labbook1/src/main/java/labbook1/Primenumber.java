package labbook1;


class Primenumber 
{ 
  public static void main (String[] args) 
     {     
         int i =1; 
         int num =0; 
         //Empty String 
         String  primeNumbers = ""; 
 
         for (i = 1; i <= 20; i++)          
         {            
            int counter=0;     
            for(num =i; num>=1; num--) 
      { 
               if(i%num==0) 
         { 
       counter = counter + 1; 
         } 
      } 
      if (counter ==2) 
      { 
         //Appended the Prime number to the String 
         primeNumbers = primeNumbers + i + " "; 
      }   
         }   
         System.out.println("Prime numbers from 1 to 100 are :"); 
         System.out.println(primeNumbers); 
     } 
}