import java.util.Scanner;

public class question7
//VowelConsonant 
{
    public static void main(String[] args)
	{
        //int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word=sc.nextLine();
		word=word.toLowerCase();
		//System.out.println(word);
		int vow=0;
		int cont=0;
		
		for(int i=0; i<word.length();i++)
		{
			char ch=word.charAt(i);
						
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{	
			   vow++;
			   
			}
			else
			{
				cont++;
				
				
			}
				
		}
		System.out.println("No of Vowel " + vow);
	    System.out.println("No of consonant " + cont);
    }
}