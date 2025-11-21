import java.util.*;
class large{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("enter a number");
        int b=s.nextInt();
        System.out.println("enter a number");
        int c=s.nextInt();
        int largenum=a;
            if(b>a)
                largenum=b;
            if(c>b)
                largenum=c;
        System.out.println("largenums"+largenum);

        
        
    }
}


