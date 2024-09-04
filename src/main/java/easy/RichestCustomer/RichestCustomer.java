package easy.RichestCustomer;

import java.util.HashMap;
import java.util.Map;

public class RichestCustomer {

    public int maximumWealth(int[][] accounts) {

        int highest = 0;
        int previous = 0;
        Map<Integer, Integer> sums = new HashMap<>();

        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                previous += accounts[i][j];
            }

            if(previous > highest){
                highest = previous;

            }

            previous = 0;

        }

        return highest;
    }

    public static void main(String[] args) {
        RichestCustomer c = new RichestCustomer();

        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(c.maximumWealth(accounts));

    }
}
