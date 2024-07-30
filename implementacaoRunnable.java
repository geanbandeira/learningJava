
class MyRunnable implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
} 

public class Main {
    public static void main(String[] args) {
        
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}
