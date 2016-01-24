class BinToDec
{
public static void main(String args[])
{
int n=10101,a=0,k=1;
while(n!=0)
{


a=a+(n%10)*k;
k=k*2;
n=n/10;

}
System.out.print(a);




}}