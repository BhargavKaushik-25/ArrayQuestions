//missing number find out

public class Array4
{
	public static void main(String[] args)
	{
		int[] arr = {6,1,2,4,5};
		int min = arr[0];
		int max = arr[0];
		int sum2 = 0;
		int sum1 = 0;

		for(int i = 0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}

			if(max<arr[i])
			{
				max = arr[i];
			}
			sum1 +=arr[i];

		}

		for(int i = min; i<=max;i++)
		{
			sum2 += i;
		}
		System.out.println("MISSING NUMBER IS "+(sum2-sum1));

		System.out.println("\n===========\n");

		System.out.println("WITHOUT USING MIN AND MAX");

		int no = arr.length+1;
		int sum = (no*(no+1)/2);
		System.out.println("MISSING NUMBER "+ (sum - sum1));
	}
}