package kata2;
import java.util.HashMap;
import java.util.Map;
public class Kata2 {

    public static void main(String[] args) {
        int [] data = {0,1,1,2,8,4,5,4,7,2,6,9,4,2,5};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
            //System.out.println(key);
        
        }
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        } 

    }
    
}