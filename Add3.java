class Add3
{

public int add(int a, int b)
{
return add(a^b,(a&b)<<1);
}
public static void main(String args[])
{
Add3 obj=new Add3();
obj.add(10,20);

}



}
