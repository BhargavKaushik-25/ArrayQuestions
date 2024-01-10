//accept size an element from end user

import java.util.Scanner;

public class Array2
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENTER SIZE OF ARRAY");
		int size = sc1.nextInt();
		System.out.println("ENTER ELEMENT OF THE ARRAY");
		int[] arr = new int[size];

		for(int i = 0; i<arr.length;i++)
		{
			arr[i] +=sc1.nextInt();
		}

		for(int j = 0; j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println("\nARRAY LENGTH "+ arr.length);
	}
}