import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    private Timer timer = new Timer();

    public void scheduleMessage(String message, long delay) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Scheduled message sent: " + message);
            }
        }, delay);
    }
}
