import java.util.*;
import java.io.*;
     
      class abc{
      @Override
    
      protected void finalize()
      {
         System.out.println("Garbage collected");
      }
      public void add(){
           System.out.println("add");
           }
       public static void main(String[] args){

             abc obj1 =new abc();
             abc obj2 = new abc();
             abc obj3 = new abc();
             obj1 = null;
             obj2 = obj3;
             new abc().add();
             new abc();
             System.gc();
       }

}