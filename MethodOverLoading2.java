class MethodOverLoading2
{
public void add(double a,double b)
{

System.out.println("The Sumof two numbers is:"+(a+b));


}

public void add(double a,double  b,double c)
{
System.out.println("The Sumof three numbers is:"+(a+b+c));

}
public static void main(String args[])
{

MethodOverLoading2 obj = new MethodOverLoading2();
obj.add(10.6,7.98);
obj.add(10,0.87,0.99);

}
}