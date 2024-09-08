package Array_Programs;

public class MaxNumberFrom_Array {

	public static void main(String[] args) {
		
		int [] arr = {1,5,4,2,3,6,10,8,7,9};
		int max = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println("Max Number From Array is " + max);

	}

}
