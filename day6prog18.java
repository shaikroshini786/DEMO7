//factors of a given number
import java.util.Scanner;
class CountFactors
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{System.out.print(i);
if(i !=n)System.out.print(", ");
}
}
}
}
