class MethodOverLoading
{
public void add(int a,int b)
{

System.out.println("The Sumof two numbers is:"+(a+b));


}

public void add(int a,int b,int c)
{
System.out.println("The Sumof three numbers is:"+(a+b+c));

}
public static void main(String args[])
{

MethodOverLoading obj = new MethodOverLoading();
obj.add(10,20);
obj.add(10,20,30);

}
}