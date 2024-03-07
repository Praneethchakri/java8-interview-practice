package org.example;

public class SynchronusProcess {

    boolean flag =false;
    int counter;
   /* public synchronized boolean dataFlagCheck(int age){
        counter++;
        if(age<18) {
            System.out.println("While Less than "+counter);
            return flag = flag;
        }else{
            System.out.println("While grt that "+counter);
            return flag= !flag;
        }

    }*/
   public boolean dataFlagCheck(int age) {
       synchronized (this){
           counter++;
           if (age < 18) {
               System.out.println("While Less than " + counter);
               return flag;
           } else {
               System.out.println("While grt that " + counter);
               flag = !flag;
               return flag;
           }
       }
   }
    private void userEleigibility(boolean flag){
        if(flag==true){
            System.out.println("User Eligible to vote");
        }else if(flag==false){
            System.out.println("User Not Eligible to vote");
        }
    }

    public static void main(String[] args) {
    SynchronusProcess object = new SynchronusProcess();
        Thread t1 = new Thread(()->{
            boolean result = object.dataFlagCheck(19);
            object.userEleigibility(result);
        });
        Thread t2 = new Thread(()->{
         boolean result=  object.dataFlagCheck(18) ;
            object.userEleigibility
                    (result);
        });
        t1.start();
        t2.start();
    }
}
