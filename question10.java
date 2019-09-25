public class question10
{

   public static void main(String[] args) 
   {
   
      String[] words = { "Europ", "Car", "Dell", "Apple", "Ball" };
      int length = 5;
	  

      for(int i = 0; i < length-1; ++i) 
	  {
         for (int j = i + 1; j < length; ++j)
			 {
            if (words[i].compareTo(words[j]) > 0)
				{
               String temp = words[i];
               words[i] = words[j];
               words[j] = temp;
            }
         }
      }
      System.out.println("Dictionary order of the words is: ");
      for(int i = 0; i < length; i++) 
	  {
         System.out.println(words[i]);
      }
   }
}
