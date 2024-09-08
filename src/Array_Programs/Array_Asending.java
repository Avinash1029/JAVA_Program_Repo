package Array_Programs;

public class Array_Asending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,5,4,2,3,6,10,8,7,9};
		int c;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
