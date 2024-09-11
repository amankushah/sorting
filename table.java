import java.util.*;
class table
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=20;i++)
        {
            int t=i*n;
        System.out.println(n+"*"+i+"="+t);
       }
     }
}