import java.util.*;

public class Six
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=0,oddSum=0,evenSum=0;
        int[] arr;
        System.out.println("Enter Arr Size : ");
        size=sc.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i:arr)
        {
            if(i%2==0)
            {
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("Odd Sum is : "+(oddSum)+"Even Sum is :"+evenSum);
    }
}