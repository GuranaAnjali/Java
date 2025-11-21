// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Sweets {
    int  Counter = 0;
    public void sweetCounter() 
    {
         synchronized(this){
        Counter+= 50; }
    }
}
    class Mitai{
        public static void main(String[] args) throws InterruptedException{
            Sweets sugar = new Sweets();
            Runnable W1 = () ->{
                for(int i=0; i<10000; i++){
                    sugar.sweetCounter();
                }
            };
            Runnable W2=() ->{
                for(int i=0;i<1500;i++){
                    sugar.sweetCounter();
                }
                
            };
             Runnable W3=() ->{
                for(int i=0;i<5000;i++){
                    sugar.sweetCounter();
                }
                
            };
            Thread t1 = new Thread(W1);
            Thread t2 = new Thread(W2);
            Thread t3 = new Thread(W3);
             t1.start();
             t2.start();
             t3.start();
            
            t1.join();
             t2.join();
             t3.join();
             
             System.out.println(sugar.Counter);
            
    }
}

                            