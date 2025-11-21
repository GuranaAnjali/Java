import java.util.*;
import java.io.*;
    class TPE extends Thread{
       public void run()
       {
         for(int i=1; i<=5;i++)
         {
           System.out.println(getName()+ "running"+getPriority());
         }
             System.out.println(getName()+ "finished");
        }
   public static void main(String [] args)
   {
     Thread t1 = new TPE();
     Thread t2 = new TPE();
     Thread t3 = new TPE();
 
     t1.setName("low");
     t2.setName("norm");
     t3.setName("high");

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.NORM_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);

   t1.start();
   t2.start();
   t3.start();
}
}