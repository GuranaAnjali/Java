import java.util.*;
class cal{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=s.nextInt();
        System.out.println("enter a number:");
        int b=s.nextInt();
        int c=a+b;
        int d=a-b;
        int f=a*b;
        int g=a/b;
        int e=a%b;
       
        
    System.out.println("sum is : "+c );
    System.out.println("sub is : "+d );
    System.out.println("mul is : "+e );
    System.out.println("div is : "+f );
    System.out.println("mod is : "+g );


    }
}
