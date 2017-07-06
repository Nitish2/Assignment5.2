package BinarySearch;

import java.util.Scanner;

public class Search {

	public static void main(String args[]) {
		int c, n, t, a[], first, last, mid;

		Scanner in = new Scanner(System.in); // Taking user input
		System.out.println("Enter number of elements in array:");
		n = in.nextInt();

		a = new int[n]; // Creating array

		System.out.println("Enter the integers");

		for (c = 0; c < n; c++) // Loop to store numbers in array
			a[c] = in.nextInt();

		System.out.println("\nEnter the integer to be search:");
		t = in.nextInt();

		first = 1;
		last = a.length; // find the length of array and assign into high

		mid = first + ((last - first) / 2); // find the middle position and assign into mid
											
		

		for (first = 1; first < last; first++) // for loop

		{
			if (a[mid] < c) // if t > a[mid] increase one in the middle value

			
				mid = mid + 1;
			 else if (a[mid] > t)// if t < a[mid] decrease 1 in the middle
									// value

			{
				mid = mid - 1;
			} else if (a[mid] == t) { // Searching element in the array
				System.out.println("Integer is found");
				break; // if the element is found break this loop
			} else 
				last = mid - 1;
			
			mid = (first + last) / 2;
		}
		if (first > last)
			System.err.println("Integer is not found");
	}
}
