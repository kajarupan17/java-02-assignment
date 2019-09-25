class question9withstring 
{ 
      
    // Function to remove all spaces from a given string 
	
    static String removeSpace(String str) 
    { 
        str = str.replaceAll("\\s",""); 
        return str; 
    } 
  
    
	
    public static void main(String args[]) 
    { 
        String str = " some extra space "; 
        System.out.println(removeSpace(str)); 
    } 
} 