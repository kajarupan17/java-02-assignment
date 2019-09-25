//for loop
import java.util.Scanner;
public class question4
{
 public static void main(String[] args)
  {
     int num;
	   System.out.println("Enter the value");
	   Scanner sc=new Scanner(System.in);
	   num=sc.nextInt();
	  System.out.println();
     for(int i=1;i<=num; i++)
	  {
		  System.out.println(i);
		  for(int y=1;y<=10;y++)
		  {
			  int ans= i*y;
			  System.out.println(i + "*" + y + " = "+ ans);
		   }
		   System.out.println();
	  }  
	  
  }
}


