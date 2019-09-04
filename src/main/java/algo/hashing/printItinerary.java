package algo.hashing;

import java.util.HashMap;
import java.util.Map;

public class printItinerary {
    public static void main(String[] args) {
        Map<String,String> dataSet = new HashMap<>();
        dataSet.put("Chennai","Bangalore");
        dataSet.put("Bombay","Delhi");
        dataSet.put("Goa","Chennai");
        dataSet.put("Delhi","Goa");

        printResult(dataSet);
    }

    private static void printResult(Map<String, String> dataSet) {
        Map<String, String> reverseMap = new HashMap<>();

        for(Map.Entry<String,String> entry: dataSet.entrySet())
        reverseMap.put(entry.getValue(),entry.getKey());

        String start = null;

        for(Map.Entry entry: dataSet.entrySet()) {
            if (!reverseMap.containsKey(entry.getKey())) {
                start = (String) entry.getKey();
                break;
            }
        }
            if (start == null) {
                System.out.println("Invalid input");
                return;
            }

        String to = (String) dataSet.get(start);
        while (to != null){
               System.out.println(start +"->" + to + ", ");
               start = to;
               to = (String) dataSet.get(to);
        }
    }
}
