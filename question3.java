public class question3
{
	   public static void main(String[] args)
   {
       int i=1;  //check
	   int n=10; //loop
	   int f1=0; //num1
	   int f2=1; //num2
	   do
	   {
		   int sum=f1+f2; 
		   f1=f2;
		   f2=sum;
		   i++;
		   System.out.print(f1 + ",");
		   
	   }
	   while(i<=n); 
	   
	  
	  
   }
}