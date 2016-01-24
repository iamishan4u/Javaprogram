class Armstrong {
public void compute()
{

int a=371;
int n=371;

int b=a%10;
a=a/10;
int c=a%10;
a=a/10;
int d=a%10;

System.out.println(b);
System.out.println(c);
System.out.println(d);


 int result=b*b*b+c*c*c+d*d*d;
System.out.print(result);

if(result==n)
{
System.out.print("it is an armstromg number");
}
else
{
System.out.print("it is not an armstromg number");
}


}
public static void main(String args[])
{
Armstrong obj=new Armstrong();
obj.compute();
}
}