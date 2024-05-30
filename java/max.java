
 import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr_size = 0;
		int count=0;
		if (sc.hasNextInt()) {
			arr_size = sc.nextInt();
		}

		// Initialize the array's
		// size using user input
		int[] arr = new int[arr_size];
		for (int i = 0; i < arr_size; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0  && k>0)
			{
				arr[i]=1;
				k--;
			}
			if(arr[i]==1) {
				count++;
			}
			if(arr[i]==0){
				break;
			}
			else
			{
				
			}
			
			
			System.out.print(arr[i]+" ");	
			
		}
		
		
	}

}