import java.util.*;
class binarysearch
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n,lo=0,hi,target,i,mid=0;
        n= sc.nextInt();
        int arr[] = new int[n];
        hi=n-1;
        System.out.println("enter the elements of array");
        for(i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to search : ");
        target=sc.nextInt();
        boolean flag = false;
        while( lo<=hi)
        {
            mid=(hi+lo)/2;
          if(target>arr[mid]) lo=mid+1;
          else if(target<arr[mid]) hi=mid-1;
          else if(target==arr[mid]) 
          {
            flag =true;
            break;
          }
        }
        if(flag==true)
        {
        System.out.println("target is found at index : "+mid);
        }
        else 
        {
        System.out.println("target is not found ");
        }

    }
}
