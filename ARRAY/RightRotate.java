//No of right rotate required 

public class RightRotate
{
	public static void main(String[] args)
	{
		char[] arr1 = {'D','E','A','B','C'};
		char[] arr = {'A','B','C','D','E'};
		int count = 1;
		boolean status = false;
		for(int i = 0;i<arr.length;i++)
		{
			char temp = arr[arr.length-1];
			int j = arr.length-1;
			for(;j>0;j--)
			{
				arr[j] = arr[j-1];

			}
			if(j==0)
			{
				arr[j] = temp;
			}
			int count1 = 0;
			for (int k = 0;k<arr.length ;k++) 
			{
				if(arr[k] == arr1[k])
				{
					status = true;
					count1++;
				}
				else 
				{
					status = false;	
					count1--;
				}
			}
			if (count1 == arr1.length) 
			{
				System.out.println("both are equal ");	
			}
			if (status) 
			{
				System.out.println("BOTH THE ARRAYS ARE EQUAL AND NUMBER OF RIGHT TURNS REQUIRED "+count);
				break;	
			}
			count++;
			// if (count1 == arr1.length) 
			// {
			// 	System.out.println("both are equal ");	
			// }
		}

	}
}