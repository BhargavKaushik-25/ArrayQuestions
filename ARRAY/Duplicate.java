//PRINT THE DUOLICATE ELEMENTS IN THE SINGLE ARRAY

public class Duplicate
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,2,3,4,4};

		int len = 0;

		for(int i = 0;i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					len++;
				}
			}
		}

		int[] arr1 = new int[len];
		int k=0;

		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					arr1[k++]=arr[i];
				}
			}
		}

		for(int i =0;i<arr1.length;i++)
		{

			System.out.print(arr1[i]+" ");
		}
	}

}