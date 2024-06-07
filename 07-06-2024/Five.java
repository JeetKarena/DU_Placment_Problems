import java.util.*;
public class Five
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,prev=0;
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            prev+=i;
            System.out.print(" "+prev);
        }
    }
}