import java.util.*;
class selectionsort
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n,i,j,t=0,min,mindx;
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
        for(i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            min = Integer.MAX_VALUE;
            mindx=-1;
            for(j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    mindx=j;
                }
            }
            t=arr[mindx];
            arr[mindx]=arr[i];
            arr[i]=t;
        }
        for(i=0;i<n;i++)
        {
        System.out.print(arr[i]);
        }
        
    }
}