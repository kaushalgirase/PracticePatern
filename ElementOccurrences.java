package assinment;

import java.util.HashMap;
import java.util.Map;

public class ElementOccurrences {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10, 40, 30, 50, 20, 10};

  
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

    
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}


