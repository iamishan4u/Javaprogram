class Sortt
{
public static void main(String args[])
{
int a[]={16,2,13,4,11};
int i=0;
int j=0;
int temp=0;
for(i=0;i<a.length-i;i++)
{

 if(a[i-1]>a[i])
 {
 temp=a[i-1];
 a[i-1]=a[i];
 a[i]=temp;
  }}
for(i=0;i<a.length;i++)
{
 System.out.println(a[i]+" ");
}
System.out.println("The largest number is:"+a[i-1]);
System.out.println("The Third largest number is:"+a[i-3]);
System.out.print("The Second smallest number is:"+a[i-4]);
}
}