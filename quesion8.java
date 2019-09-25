class question8 
{

	public static void main(String[] args)
	{

		String word ="apple , orange , strawberry , banana";
		char[] arr = word.toCharArray();
		// int count =0;
		for (int i=0;i<arr.length ;i++ ) 
			{
				// System.out.println(arr[i]);

				if (arr[i] != ',')
				{
				System.out.print(arr[i]);
				}
					else
					System.out.print(" ");
			}
		}

}


