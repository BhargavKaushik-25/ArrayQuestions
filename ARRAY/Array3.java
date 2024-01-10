//find minimum and maximum element from an array

public class Array3
{
	public static void main(String[] args)
	{
		int[] arr = {5,4,1,3,8};
		int min = arr[0];
		int max = arr[0];
		

		for(int i = 1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}