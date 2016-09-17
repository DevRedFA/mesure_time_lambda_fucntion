import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
       Timer timer = new Timer();
        long time = timer.mesureTime(Main::bigDecimalPower);
        System.out.println(time);
    }

    private static void bigDecimalPower() {
        new BigDecimal("1234567").pow(10000);
    }

}
