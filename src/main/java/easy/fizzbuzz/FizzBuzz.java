package easy.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    // Provided a list we need to provide output
    public List<String> fizzBuzz(int n) {
        List<String> fizzList = new ArrayList<>();

        if(n == 0){
            return fizzList;
        }
        for(int i = 1; i <= n; i++){

            if(i % 15 == 0){
                fizzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzList.add("Fizz");

            } else if (i % 5 == 0) {
                fizzList.add("Buzz");
            }else{
                fizzList.add(String.valueOf(i));
            }
        }

        return fizzList;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(5));
    }
}
