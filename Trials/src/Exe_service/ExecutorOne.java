package Exe_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorOne {
    public static void main(String args[]){
      /*  for(int i=0;i<10;i++) {
            Thread t = new Thread(new Task());
            t.setName(i+"AJ");
            t.start();
        }*/
        int a=1;
        Integer b =new Integer(1);
        System.out.println("a==b"+ (a==b));
        int coreCnt=Runtime.getRuntime().availableProcessors();
        System.out.println(coreCnt);
        ExecutorService eServ= Executors.newFixedThreadPool(coreCnt);
        for(int i=0;i<20;i++){
            eServ.execute(new Task());
        }

        System.out.println("Main Thread is running"+Thread.currentThread().getName());
    }


}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running "+Thread.currentThread().getName());
    }
}
