import java.util.*;
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Task 1 - Count: " + i);
        }
    }
}
class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Task 2 - Count: " + i);
        }
    }
}

public class mYThread {
//    public Thread(){

//     }
//     public Thread(Runnable r){
//         r.run();

//     }
//     public void start(){

//     }
//     public bool isAlive(){

//     }
   public static void main(String[] args ) {
    Thread1 thread1 = new Thread1();
    Thread2 thread2 = new Thread2();
    
    thread1.start();
    thread2.start();
   }
}
