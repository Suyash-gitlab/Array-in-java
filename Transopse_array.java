package Array;
import java.util.*;
public class Transopse_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array :");
		int i,j;
		int a[][]=new int [3][3];
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					a[i][j]=sc.nextInt();

				}
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
			 
			
		}
	

}
