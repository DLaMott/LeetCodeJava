package medium;

import medium.insert_delete_get_random.InsertDeleteGetRandom;
import org.junit.jupiter.api.Test;

public class MediumTestCases {

    @Test
    void testInsertDeleteGetRandom(){

        InsertDeleteGetRandom insertDeleteGetRandom = new InsertDeleteGetRandom();

        insertDeleteGetRandom.insert(1);
        insertDeleteGetRandom.remove(1);
        insertDeleteGetRandom.insert(1);
        insertDeleteGetRandom.remove(2);
        insertDeleteGetRandom.insert(2);
        insertDeleteGetRandom.insert(1);

    }
}
