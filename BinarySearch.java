import java.util.Scanner;
public class BinarySearch
{
public static void binarySearch(int arr[], int first, int last, int num){  
   int mid = (first + last)/2;  
   while( first <= last )
   {  
      if ( arr[mid] < num )
      {  
        first = mid + 1;     
      }
      else if ( arr[mid] == num )
      {  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
       else
         {  
         last = mid - 1;  
         }  
      mid = (first + last)/2;  
   }  
   if ( first > last )
   {  
      System.out.println("Error Element Not Found");  
   }  
 }
public static void main(String[] args)
   {
      //my array list
      int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};  
      //my scanner 
        Scanner scan = new Scanner(System.in);
        //how to enter any number
         System.out.print("Enter any number: ");
         int num = scan.nextInt();
         //gets array length
        int last=arr.length-1; 
        //goes to the other public void to execute 
        binarySearch(arr,0,last,num);  
   }
}
  