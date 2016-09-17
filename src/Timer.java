/**
 * Created by Ivan on 17.09.2016.
 */


public class Timer {
    public long mesureTime (Runnable runnable){
        long startTime = System.currentTimeMillis();
        runnable.run();
        return  System.currentTimeMillis() - startTime;
    }
}
