package medium.insert_delete_get_random;

import java.util.*;

public class InsertDeleteGetRandom {

    private Random random;
    private final List<Integer> itemList;
    private final Map<Integer, Integer> uniqueThings;

    public InsertDeleteGetRandom() {

        this.itemList = new ArrayList<>();
        this.uniqueThings = new HashMap<>();
        this.random = new Random();

    }

    public boolean insert(int val) {

        if(uniqueThings.containsKey(val)){
            return false;
        }

        uniqueThings.put(val, itemList.size());
        itemList.add(val);
        return true;

    }

    public boolean remove(int val) {
        if(!uniqueThings.containsKey(val)){
            return false;
        }

        int pointer = uniqueThings.get(val);
        int endVal = itemList.get(itemList.size()-1);


        itemList.set(pointer, endVal);
        uniqueThings.put(endVal, pointer);

        itemList.remove(itemList.size() - 1);
        uniqueThings.remove(val);

        return true;

    }

    public int getRandom() {

        return itemList.get(random.nextInt(itemList.size()));

    }
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
