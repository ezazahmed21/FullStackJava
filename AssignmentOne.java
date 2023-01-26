
public class AssignmentOne {

	public static void main(String[] args) {
	
		
		int n=12;
	
		
		
		System.out.println();System.out.println();
		System.out.println();
		
		
		
		// Problem 2
		System.out.println("Problem 2 ::: ");
		n=4;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					
					System.out.print(i+1);
					
				}
				System.out.println();
			}
			
			System.out.println();System.out.println();
			System.out.println();
			
			System.out.println("Problem 3 ::: ");
			//Problem 3
			int m=14;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					if((i==0 && j < m-1) || (i<m-1 && j==0) || (i==m-1 && j <= m-1) || (j==m-1 && i<m-1) 
						||  (i+j) == (m-1)/2 || (j-i) == (m)/2 || (i+j) < (m-1)/2 || (j-i) > (m-1)/2)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			System.out.println();System.out.println();
			System.out.println();
			System.out.println("Problem 4 ::: ");
			
			n=14;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(i-j>=(n-1)/2 && i>=(n-1)/2  && j<=(n-1)/2 || i+j >= n-1 + (n-1)/2 && i>=(n-1)/2 && j>(n-1)/2
							
							)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			System.out.println();System.out.println();
			System.out.println();
			System.out.println("Problem 5 ::: ");
			
			
			n=14;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(i+j<=(n-1)/2 && j<=(n-1)/2 && i<=(n-1)/2||
							i-j>=(n-1)/2 && i>=(n-1)/2  && j<=(n-1)/2 ||
							i== 0 && j< n -1 || i == n -1 && j< n -1
							)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
			System.out.println("Problem 1 ::: INEURON ");
			n=12;
			for(int i=0;i<n; i++)
			{
				//I
				for(int j=0 ; j<n; j++)
				{
					if(i==0 && j <n-1 || i<(n-1) && j==(n-1)/2 || i == n-1 && j <n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				//N
				System.out.print(" ");
				for(int j=0 ; j<n; j++)
				{
					if(i< n && j == 0 || i <n && j==n-1 || i == j)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				//E
				System.out.print(" ");
				for(int j=0 ; j<n; j++)
				{
					if((i==0 && j<(n-1))  || (i==(n-1)/2) && j>0 && j<(n-1)/2 
							||(i==n-1 && j<(n-1)) ||
							 j==0
							)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				//U
				System.out.print(" ");
				for(int j=0 ; j<n; j++)
				{
					if( j==0  && i<n-1 
							|| i==n-1 && j>0 && j<(n-1) || j==(n-1) && i<n-1 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				
				//R
				System.out.print(" ");
				for(int j=0 ; j<n; j++)
				{
					if((i==0 && j<(3*n)/4)|| (i==(n-1)/2)&& j>0 && j<(3*n)/4 
							||
							(j==(3*n)/4) && i>0 && i<(n-1)/2  || j==0 ||  i-j==(n/3))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				
				//O
				System.out.print(" ");
				for(int j=0 ; j<n; j++)
				{
					if( i==0 && j>0 && j<(3*n)/4  || j==0 && i>0 && i<n-1 
							|| i==n-1 && j>0 && j<(3*n)/4 || j==(3*n)/4 && i>0 && i<n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				
				//N
				System.out.print(" ");
				for(int j=0 ; j<n; j++)
				{
					if(i< n && j == 0 || i <n && j==n-1 || i == j)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
						
					}
					
				}
				System.out.println();
				
			}
			
			
			
			
		}
		
		
}
	


