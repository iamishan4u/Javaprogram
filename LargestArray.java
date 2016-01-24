class LargestArray
{
public static void main(String args[])
{
int a[]={16,2,13,4,11};
int i=0;
int j=0;
int temp=0;
for(i=0;i<a.length;i++)
{
for(j=1;j<a.length-i;j++)
{
 if(a[j-1]>a[j])
 {
 temp=a[j-1];
 a[j-1]=a[j];
 a[j]=temp;
  }}}  
for(i=0;i<a.length;i++)
{
 System.out.println(a[i]+" ");
}
System.out.println("The largest number is:"+a[i-1]);
System.out.println("The Third largest number is:"+a[i-3]);
System.out.print("The Second smallest number is:"+a[i-4]);
}
}