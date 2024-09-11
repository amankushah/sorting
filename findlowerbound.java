import java.util.*;
class findlowerbound
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n,lo=0,i;
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of sorted array");
        for(i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to search : ");
       int target=sc.nextInt();
       for(i=0;i<n;i++)
        {
          if(target==arr[i]) 
          {
            System.out.println("the lower bound of "+target+" is : "+i);
            break;
          }
          else if(target>arr[n-1]) 
          {
            System.out.println("the lower bound of "+target+" is : "+n);
            break;
          }
          else if(target<arr[0]) 
          {
            System.out.println("the lower bound of "+target+" is : "+0);
            break;
          }
          else if(target>arr[i] && target<arr[i+1]) 
          {
            int idx=i+1;
            System.out.println("the lower bound of "+target+" is : "+idx);
            break;
          }

        }
        
    }
}
