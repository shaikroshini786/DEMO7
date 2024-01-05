import java.util.Scanner;
class   CountinueEx1
{
public static void main(String args[])
{
//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
int i=1;
while(i<25)
{
i++;
 if(i%5==0) continue;
System.out.print(i+",");
}
}
}
out put:
2,3,4,6,7,8,9,11,12,13,14,16,17,18,19,21,22,23,24