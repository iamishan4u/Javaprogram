class DiagonalSum
{
public static void main(String args[])
{
int sum=0;
int a[][]={{1,2,3},
           {4,5,6},
		   {7,8,9}};
		   
for(int i=0;i<a.length;i++)
{

  for(int j=0;j<a.length;j++)
{
  
   if(i==j)
{

sum=sum+a[i][j];

}
 
}}
		   
System.out.print("The sum of Diagonal matrix is:"+sum);   






















}}