import java.util.*;
class reverse
{
    public static void main(String[]args)
    {
        String reverse="";
    Scanner s=new Scanner(System.in);
    System.out.println("enter a num.:");
    int a=s.nextInt();
    String length=a.length();
    int i;
    for (i=length-1;i>=0;i--){
    reverse=reverse+a.charAt(i);

    }
    System.out.println(reverse); 

}
}