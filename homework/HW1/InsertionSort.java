import java.util.ArrayList;

/**
 * Written by Evan Scales
 */
public class InsertionSort implements SortBehavior {
    // InsertionSort based off 
    // https://www.interviewbit.com/tutorial/insertion-sort-algorithm/#pseudocode
    public ArrayList<String> sort(ArrayList<String> data) {
        for (int i = 1; i < data.size(); i++) {
            String key = data.get(i);
            int j = i - 1;
            while (j >= 0 && key.compareTo(data.get(j)) < 0 ) {
                data.set(j+1, data.get(j));
                j--;
            }
            data.set(j+1, key);
        }
        return data;
    }
}
