package package2;

import java.util.*;

public class Problem_18 {
    public static void main(String[] args) {
        String str = "Engineer".toLowerCase(); 
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //  descending order
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        //  result in required format
        
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list)
        {
            result.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(result);
    }
}
