public class TimerThread extends Thread{

private int minute;
private int seconds;

    public TimerThread(int minut, int second){
        this.seconds = second;
        this.minute = minut;
    }

    @Override
    public void run() {
        while(minute >= 0){
        for(int i = seconds; i >= 0 ; i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf(" %d : %d\n",minute,i);
        }
        seconds = 59;
        minute --;
    }

}
}