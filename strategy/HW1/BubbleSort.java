import java.util.ArrayList;

/**
 * Written by Evan Scales
 */
public class BubbleSort implements SortBehavior {

    public ArrayList<String> sort(ArrayList<String> data) {
        // BubbleSort based off CSCE 146 lab 00 Spring 2021
        boolean hasSwapped = true;
        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < data.size()-1; i++) {
                if (data.get(i).compareTo(data.get(i+1)) > 0 ) {
                    String temp = data.get(i);
                    data.set(i, data.get(i+1));
                    data.set(i+1, temp);
                    hasSwapped = true;
                }
            }
        }
        return data;
    }
}
