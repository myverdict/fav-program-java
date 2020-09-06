/**
	The ReverseIntArrayFor class reverses the order of the integer array using 
	the for loop.
*/
public class ReverseIntArrayFor
{
	public static void main(String[] args)
	{
		int num[] = { 1, 2, 3, 4, 5 };	// integer array.
		
		// Print the original integer array.
		System.out.print("The original integer array is: ");
		for(int k = 0; k < num.length; k++)
		{
			System.out.print(num[k] + " ");
		}
		
		// Reverse the integer array.
		for(int i = 0, j = num.length - 1; i < j; i++, j--)
		{
			num[i] = num[i] + num[j];
			num[j] = num[i] - num[j];	
			num[i] = num[i] - num[j];
			// For debugging purposes.
			// System.out.println("\n\nnum[i] = " + num[i] + 
			//				      "\nnum[j] = " + num[j]);
		}
		
		// Print the reversed integer array.
		System.out.print("\n\nThe reversed integer array is: ");
		for(int k = 0; k < num.length; k++)
		{
			System.out.print(num[k] + " ");
		}		
	}
}