
import java.util.Scanner;
class ProductDigits1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int pd=1;
System.out.println("enter any positive integer:");
n=sc.nextInt();
while(n>0)
{
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
}
/*output:
enter any positive integer:
1024
0
enter any positive integer:
4532
120
*/
