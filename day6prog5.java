class Test4
{
public static void main(String args[])
{
int i;
int sum=0;
while(i<=100)
{
sum=sum+i;
i=i+5;
System.out.print(i+"+");
}
System.out.print("\b"+"="+sum);
}
}