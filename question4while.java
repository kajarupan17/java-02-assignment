//while loop
import java.util.Scanner;
public class question4while

{
public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
		int num;
	System.out.println("Enter the number: ");
		num=sc.nextInt();
		int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=10)
			{
				int ans = i*j;
				System.out.println(i + "*" + j + " = "+ ans);
				j++;
			}
			System.out.println();
			 
			
		}
		
	
	}
}