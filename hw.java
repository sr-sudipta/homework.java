import java.util.Scanner;
import java.util.Arrays;
class hw{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n;
System.out.println("Enter No. of Chocolates:");
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the Weight of chocolate:");
a[i]=sc.nextInt();
}

  Arrays.sort(a);

System.out.printf("Chcolate on basis of weights : %s", 
                          Arrays.toString(a)); 
}
}
