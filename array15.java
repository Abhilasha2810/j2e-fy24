package student.banasthali.abhilasha;

import java.util.Arrays;
import java.util.Collections;

public class array15 {
  
	public static int kthSmallest(Integer[] arr, int K)
	{
		
		Arrays.sort(arr);

		
		return arr[K - 1];
	}

	
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int K = 2;

	
		System.out.print("K'th smallest element is "
						+ kthSmallest(arr, K));
	}
}



