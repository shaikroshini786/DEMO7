//factors of a given number count is prime or not
import java.util.Scanner;
class CountFactors3
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
System.out.print(i);
if(i !=n)System.out.print(", ");
}
}
System.out.println("\nCount of factors of "+ n + "is" +count);
if(count==2)System.out.println("PRIME");
else
System.out.println("NOT PRIME");
}
}
