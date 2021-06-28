public class TimerExample{
    public static void main(String[] args){
        TimerThread timer = new TimerThread(2, 15);
        timer.run();
    }
}