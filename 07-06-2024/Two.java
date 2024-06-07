import java.util.*;

public class Two{
    public static void main(String[] args)
    {
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        Boolean isprime=false;
        for(int i=2;i<=(number/2);i++)
        {
            if(number%i==0)
            {
                isprime=true;
            }
        }
        if(isprime)
        {
        System.out.println("Number is Not Prime");

        }else{

        System.out.println("Number is prime");
        }
    }
}

//3. palindrom or not 
//2. prime
//4. bit wise odd even