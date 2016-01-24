class MultiOfMatrix
{
public static void main(String args[])
{
int a[][]={{1,2,3},
           {4,5,6},
		   {7,8,9}};

int b[][]={{1,1,1},
           {1,1,1},
           {1,1,1}};
		   
int sum[][]={{0,0,0},
             {0,0,0},
			 {0,0,0}};

			 for(int i=0;i<a.length;i++)
{
 for(int j=0;j<a.length;j++)
 {
  System.out.print(a[i][j]);
 }
 System.out.println();
}		   
	
for(int i=0;i<b.length;i++)
{
 for(int j=0;j<b.length;j++)
 {
  System.out.print(b[i][j]);
 }
 System.out.println();
}
System.out.println();
System.out.println("The Multiplication of the matrix is:");

for(int i=0;i<sum.length;i++)
{
 for(int j=0;j<sum.length;j++)
 {
  for(int k=0;k<sum.length;k++)
 {
  sum[i][j]=sum[i][j]+a[i][k]*b[k][j];
 }
 
   System.out.print(sum[i][j]);
}	   
System.out.println();	 
}

	
}
}