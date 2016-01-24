class Variable2{
static int a =20;

void msg()
{
a=a+20;
System.out.println(a);
}
public static void main(String args[])
{
System.out.println(a);
Variable2 obj=new Variable2();
obj.msg();
a=a-10;
System.out.println(a);


}
}