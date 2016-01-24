class NotPrime
{
public static void main(String args[])
{

for(int n=1;n<=100;n++)
{
if(n<=7)
{
if(n%2==0)
{
System.out.println(n);
}
}

if(n>=8 && n<=100)
{
if(n%2==0 || n%3==0 || n%5==0 || n%7==0)
{
System.out.println(n);
}

}
}
}
}