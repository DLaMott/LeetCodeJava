package medium.fruits;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FruitScanner {

    /***Based on the problem we can divide this into three methods
     * 1. Read the file
     * 2. Store occurrences
     * 3. Sort by occurrence and alpha
     */

    public void itsFruitTime(String path){

        showMeTheFruits(sortFruitMap(dataFileExtraction(path)));

    }

    private Map<String, Integer> dataFileExtraction(String path){
        Map<String, Integer> fruitMap = new HashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line;

            while((line = bufferedReader.readLine()) != null){

                String fruit = line.trim().toLowerCase();
                fruitMap.put(fruit, fruitMap.getOrDefault(fruit, 0) + 1);
            }


        }catch (FileNotFoundException e){

            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  fruitMap;
    }

    /**
     *
     * @param fruitMap A Map of fruit and their occurrences
     * @return a List of Map Entires Sorted by occurrence and Alpha
     */
    private List<Map.Entry<String, Integer>> sortFruitMap(Map<String, Integer> fruitMap){

        List<Map.Entry<String, Integer>> sortedFruitMap = new ArrayList<>(fruitMap.entrySet());

        sortedFruitMap.sort((entry1, entry2) -> {
            int countCompare = entry2.getValue().compareTo(entry1.getValue());
            if (countCompare != 0){
                // Value is higher present to comparator based on number
                return countCompare;
            }else{

                // Compare the keys lexicographically
                return entry1.getKey().compareTo(entry2.getKey());

            }
        });

        return sortedFruitMap;
    }

    /**
     * Make it generic because why not?
     * @param listMap Takes in a List of Map Entries and prints the values
     * @param <K> entry keys
     * @param <V> entry values
     */
    private <K,V> void showMeTheFruits(List<Map.Entry<K,V>> listMap){

        for(Map.Entry<K,V> entry : listMap){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        FruitScanner fruitScanner = new FruitScanner();
        fruitScanner.itsFruitTime("C:\\Users\\dylan\\IdeaProjects\\LeetCodeJava\\src\\main\\java\\medium\\fruits\\fruit.txt");
    }
}
