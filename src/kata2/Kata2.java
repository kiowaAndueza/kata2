package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {0,1,1,2,8,4,5,4,7,2,6,9,4,2,5};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++) {
            int clave = data[i];
            if(histogram.containsKey(clave)){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }

        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
            //System.out.println(key);
        } 

    }

}