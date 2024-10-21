package Array;
import java.util.*;
public class Max_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		int a[][]=new int[3][3];
		System.out.println("Enter the String array :");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int max=a[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(max<a[i][j]) {
					max=a[i][j];				}
			}
		}
		System.out.println(max);
		
		

	}

}
