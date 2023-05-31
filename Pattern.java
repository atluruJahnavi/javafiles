package day1;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		boolean flag1=false,flag2=false;
		for(int i=0;i<n;i++)
		{
			if(i==1)
				flag1=true;
			if(i>(n/2)+1)
				flag2=true;
			if(i>(n/2)-1 && flag1)
			{
				c+=1;
				flag1=true;
				
			}
			if(i>(n/2) && flag2)
			{
				flag1=false;
				flag2=true;
				c--;
			}
			for(int j=0;j<n;j++)
			{
				if(i==0)
					System.out.printf("C");
					else if(i==n-1)
					System.out.printf("K");
					else if(i==(n/2)-1 || i==(n/2)){
						System.out.printf("S");
						
						
					}
					else if(i<(n/2)-1)
					{
						if(j>(n/2)-1-c && j<(n/2)+c)
							System.out.printf("S");
						else
							System.out.printf("C");
					
						
				}
					else
					{
						if(j>(n/2)-1-c && j<(n/2)+c)
							System.out.printf("S");
						else
							System.out.printf("K");
					}
			
			}
			System.out.println("");
		}
	}
}
