package labbook1;
import java.util.Scanner;
class Vowel
{
	public static void main(String[ ] arg)
	{
	String s;
	char ch;
	int i=0;
Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	s=sc.nextLine();	
	System.out.println("Vowels in a string are"); 
	for(int j=0;j<s.length();j++)
	{
	ch=s.charAt(j);	
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :	
	 case 'U'  :i=1;
		System.out.println(ch); 			 
	}	
	}
	/*if(i==0)
		System.out.println("There are no vowels in a string"); 
	    char ch// = 'k'; 
	    
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) 
            System.out.println(ch + " is vowel"); 
        else 
            System.out.println(ch + " is consonant"); */
	
	}
}