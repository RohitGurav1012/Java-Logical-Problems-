
import java.util.ArrayList;
import java.util.List;

public class Problem_10 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5); 
        List<Integer> list2 = List.of(3, 4, 6); 
        
        List<Integer> intersection = new ArrayList<>();

        for (int num : list1) {
            if (list2.contains(num)) {
                intersection.add(num); 
            }
        }

        System.out.println(intersection); 
    }
}

