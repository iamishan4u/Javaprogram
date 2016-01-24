class OverLoadingTest
{
public static void main(String args[])
{
OverLoadingTest obj=new OverLoadingTest();
obj.abc(12);
obj.abc(12,13);
obj.abc('c');
obj.abc('a',12);







}
public void abc(int a )
{
System.out.println(a);

}
public void abc( int a,int b)
{
System.out.println(a+b);
}
public void abc(char a )
{
System.out.println(a);
}
public void abc(char a,int b )
{
System.out.println(a);
System.out.println(b);
}

}