//finding the palimdrome
import java.util.Scanner;
class SumDigits2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,  temp;
int rd=0;
n=sc.nextInt();
 temp=n;
while(n>0)
{
rd=rd*10+(n%10);
n=n/10;
}
if(rd== temp)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not a palindrome");
}
}
}