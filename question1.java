public class question1
{

	public static void main(String[] rgs)
	{
		int num = 12345;
		int rev =0;
		
     while (num !=0)
	 {
		 int digit = num % 10;
		 //System.out.println(digit);
		 rev =rev *10+digit;
		 //System.out.println(rev);
		 num=num/10;
		 //System.out.println(rev);
		 
	 }
		System.out.println(rev);
	}
	
	
}