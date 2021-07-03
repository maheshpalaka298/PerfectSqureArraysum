package packcodecamp;
import java.util.*;
public class PSquareArray {

	public static void main(String[] args) {
		int n,i,sum=0,k=0;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter no of Elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for( i=0;i<n;i++)
		{
			int root=(int)Math.sqrt(arr[i]);
			if(arr[i]==root*root) {
			sum=sum+arr[i];
			arr1[k++]=arr[i];
			}
	    }
		System.out.println("The Perfect Squares are : ");
		for(i=0;i<k;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nThe Perfect Square Sum is "+sum);
	}
}

