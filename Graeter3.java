class Graeter3
{
public static void main(String args[])
{
int a=12345;
int sum=0;
for(;a>0;)
{
int lastdigit=a%10;

sum=sum+lastdigit;

a=a/10;




}
System.out.print(sum);


















}}