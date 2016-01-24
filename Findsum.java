class Findsum
{
public static void main(String args[])

{
int number=123436;
int sum=0;
while(number!=0)
{
int lastdigit=number%10;
sum=sum+lastdigit;
number=number/10;
}
System.out.print(sum);
}
}


