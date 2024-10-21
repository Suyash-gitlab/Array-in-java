package Array;
import java.util.*;
public class multidimensional 
{
	public static void main(String[] args) 
	{

		int a[][][]=new int [3][3][3];
		int k,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		for(k=0;k<2;k++)
		{
			System.out.println("Index at :"+k);
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
				 	a[k][i][j]=sc.nextInt();
				}
		 	System.out.println();

			}
		}

		
			System.out.println("Addition is :");
			for(i=0;i<3;i++) 
			{
				for(j=0;j<3;j++) 
				{
					a[2][i][j]=a[0][i][j]+a[1][i][j];
					System.out.print(a[2][i][j]+" ");
				}
				System.out.println();
			}
				

		}

		
	}
