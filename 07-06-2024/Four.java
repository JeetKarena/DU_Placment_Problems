import java.util.*;
public class Four
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number,ans;
        number=sc.nextInt();
        ans=number&1;
        if(ans!=1)
        {
            System.out.println("Number is Even");
        }
        else{

            System.out.println("Number is Odd");
        }
    }
}