package assisited.practice2;


import java.util.Scanner;
public class ArrayRotate
{
	public static void main(String[] args)   
	{  
	int n;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	n=sc.nextInt();  
	int[] array = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
 
	array[i]=sc.nextInt();  
	}  
	System.out.println("Array elements are: ");
	
	System.out.println("Enter how man times right rotate:");
	int itr;
	itr=sc.nextInt();
	for(int j=0;j<itr;j++)
	{
		int temp=array[n-1];
		for(int i=n-1;i>0;i--)
		{
			array[i]=array[i-1];
		}
		array[0]=temp;
	}
	for (int i = 0; i < n; i++)
        System.out.print(array[i] + " ");
		

	
	
	
	
	
	
	
	}
}
