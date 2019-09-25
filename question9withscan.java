import java.io.*;
import java.util.Scanner;

public class question9withscan 
{
	
   public static void main(String args[]) 
   {
	   
      System.out.println("Enter a string value ::");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(str.replaceAll(" ", ""));
   }
}