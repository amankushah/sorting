import java.util.*;
class insertionsort
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n,i,j,t;
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
        for(i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            for(j=i;j>=1;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;

                }
                else break;
            }
        }
        for(i=0;i<n;i++)
        {
        System.out.print(arr[i]);
        }
        
    }
}