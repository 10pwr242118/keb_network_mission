package network.mission0214;

class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class missionOne {
    public static void main(String[] args) {
        Worker work = new Worker();
        work.run();
    }
}
