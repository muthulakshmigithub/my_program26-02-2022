import java.util.Scanner;
public class PeakElement {
	
	public static void main(String[]args) {
		//Peak Element to print index of greatest number given in the array; 
			// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter the Array Size");
			int n= sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the Array Elements");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				}
			int a=0,j=0;
			for(int i=0;i<n;i++) {
				if(a<arr[i]) {
					a=arr[i];
					j=i;
				}
				}
			System.out.println("The index of the peak "+ a +" element which u given is "+j);
			
		}

	}
