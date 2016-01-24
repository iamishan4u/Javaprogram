class MidVal
{
public static void main(String args[])
{
int length=0;
int b;
int a=12345;
int a1=a;
while(a>0)
{
b=a%10;
a=a/10;
length++;

}
System.out.println("The total length is:"+length);
int mid=(length+1)/2;

System.out.println("The middle value is:"+mid);

int j=0;
int midvalue=0;
while(j<mid)
{
midvalue=a1%10;
a1=a1/10;
j++;

}
System.out.print("The middle value is"+midvalue);

}}