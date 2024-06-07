import java.util.*;
public class Three
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int number,rev=0,num;
        number=sc.nextInt();
        num=number;
        while(number!=0)
        {
            rev=rev*10+(number%10);
            number=number/10;
        }
        if(num==rev)
        {
            System.out.println("Number is palindrom");
        }else{

            System.out.println("Number is not palindrome");
        }
    }
}