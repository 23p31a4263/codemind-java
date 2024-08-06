import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner r= new Scanner(System.in);
        int a=r.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}