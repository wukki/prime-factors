import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {
    public static List<Long> getForNumber(long input) {
        List<Long> primes = new LinkedList<Long>();
        int i = 2;
        while (input != 1 && input > 1) {
            if (input % i == 0) {
                primes.add(new Long(i));
                input = input / i;
            }
            else i++;
        }
        return primes;
    }
}
