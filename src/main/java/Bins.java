import java.util.HashMap;
import java.util.Map;

public class Bins {

//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//    results.incrementBin(10); // should increment bin # 10

    Map<Integer, Integer> bin = new HashMap<>();
    //Maps take two types. First one is the key, second is the value. When Key is called, Value returns.
    //In my case, first Integer is the sum of the 2 dies and second is amount of time rolled.

    public Bins (Integer minSum, Integer maxSum) {
        //based on line 6, it takes in two parameters for new Bin. 2 being the min sum and 12 being max.
        for (int i = minSum; i <= maxSum; i++) {
            // i represent the sum of two dies.
            bin.put(i,0);
        }

    }

    public Integer getBin(Integer sum) {
        return bin.get(sum);
    }

    public void incrementBin(Integer sum) {
        Integer temp = bin.get(sum) + 1;
        bin.put(sum,temp);
    }
}
