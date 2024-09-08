package Array_Programs;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int [] arr = {1,5,4,2,3,6,10,8,7,9};
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + ",");
		}

	}

}
