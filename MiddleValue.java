class MiddleValue
{
public static void main(String args[])
{
 int a=1231347;
 int a1=a;
 int b=1;
 int count=0;
 while(a>0)
 {
 b=b%10;
 a=a/10;
 count++;
 }
 System.out.println("The count is:"+count);
 int mid=(count+1)/2;
 System.out.print("The mid value index is:"+mid);
 int j=0;
 int middlevalue=1;
 while(j<mid)
 {
 middlevalue=a1%10;
 a1=a1/10;
 j++;
 
 }
 
System.out.println("The middle value is:"+middlevalue);
}


}