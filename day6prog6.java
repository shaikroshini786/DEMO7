//finding the Sum digit
import java.util.Scanner;
class SumDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
n=sc.nextInt();
while(n>0)
{
rem=n%10;
sd=sd+rem;
n=n/10;
}
System.out.println(sd);
}
}