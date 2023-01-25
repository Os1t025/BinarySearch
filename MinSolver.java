import java.util.Scanner;
public class MinSolver
{
public static void main (String[] args)
   {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you want in the array");
        int num = scan.nextInt();
        int[] arr = new int[num];
        
        System.out.println("Enter "+ num +" elements for the array");
            for (int i = 0; i < num; i++)
            {
               arr[i] = scan.nextInt();
            }
        int ans = min(arr, 0, arr.length - 1);
        System.out.println("Minimum element is: "+ ans);
   }


         public static int min(int[] arr, int low, int high)
         {
            if (high < low)  
               return arr[0];        
            if (high == low) 
               return arr[low];
  
            int mid = (high + low)/2;
            if (mid < high && arr[mid + 1] < arr[mid])
               return arr[mid + 1];            
            if (mid > low && arr[mid] < arr[mid - 1])
               return arr[mid];
           
            if (arr[high] > arr[mid])
               return min(arr, low, mid - 1);
               return min(arr, mid + 1, high);
    }
}