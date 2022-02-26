import java.util.*;
public class MinMaxArray {

	public int max(int[] arr) {
		
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				
				max = arr[i];
				
			}
			
		}
		return max;
		
	}
	
	public int min (int[] arr) {
		
		
		int min =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				
				min= arr[i];
				
			}
			
		}
		return min;
	}
	public static void main(String[]args) {
		System.out.println("Enter the numbers: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int marr[]= new int[n];
		//int marr[]= {1,2,5,6,8};
		for(int i=0;i<n;i++) {
			marr[i]=sc.nextInt();
		}
		
		MinMaxArray m  = new MinMaxArray();
		System.out.println("The minimum value is: "+m.min(marr));
		System.out.println("The maximum value is: "+m.max(marr) );

		
	}
}
