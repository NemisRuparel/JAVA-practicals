class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("Even thread interrupted");
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 200; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted");
            }
        }
    }
}

public class practical26 {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        
        even.start();
        odd.start();
    }
}