import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("enter the number of elements in the array");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.println("Enter the target to search");
		int target=sc.nextInt();
		Main m=new Main();
		m.binarySearch(0,n-1,target,a);
	}
	void binarySearch(int start,int end,int target,int [] a)
	{
	    int mid;
		if(start<=end)
		{
		    mid=start+(end-start)/2;
		    if(a[mid]==target)
		    {
		        System.out.println("Elementy found at "+(mid+1)+" position");
		    }
		    else if(target<a[mid])
		     binarySearch(start,mid-1,target,a);
		    else if(target>a[mid])
		     binarySearch(mid+1,end,target,a);
		     
		}
		else{
		    System.out.println("element not found");
		}
	}
}
