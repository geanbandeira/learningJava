
class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Main{
	public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.start();

	}
}
