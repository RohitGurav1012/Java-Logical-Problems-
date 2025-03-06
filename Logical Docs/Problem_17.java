package package2;

import java.util.*;

public class Problem_17 {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) 
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars); 
            String sorted = new String(chars); 

            if (!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>()); 
            }
            map.get(sorted).add(word); 
        }

        System.out.println(new ArrayList<>(map.values())); 
    }
}

