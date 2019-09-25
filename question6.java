
import java.util.Scanner;

public class question6
//VowelConsonant 
{
    public static void main(String[] args)
	{
        int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next( ).charAt(0);
		//System.out.println(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		{	
           System.out.println("Entered character "+ch+" is  Vowel");
        }
		else
           System.out.println(ch + " is consonant");
    }
}