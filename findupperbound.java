import java.util.*;
class findupperbound
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter the size of array");
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
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
        for(j=i+1;j<n;j++)
        {
          if(target==arr[j]) 
          {
            System.out.println("the upper bound of "+target+" is : "+j);
             break;
          }
        else
        {
        System.out.println("the upper bound of "+target+" is : "+i);
        break;
        }
      }
      break;
        }

          else if(target>arr[n-1]) 
          {
            System.out.println("the upper bound of "+target+" is : "+n);
            break;
          }
          else if(target<arr[0]) 
          {
            System.out.println("the upper bound of "+target+" is : "+0);
            break;
          }
          else if(target>arr[i] && target<arr[i+1]) 
          {
            int idx=i+1;
            System.out.println("the upper bound of "+target+" is : "+idx);
            break;
          }
        }

    }
}
