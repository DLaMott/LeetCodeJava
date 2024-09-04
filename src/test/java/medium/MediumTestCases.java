package medium;

import medium.insert_delete_get_random.InsertDeleteGetRandom;
import medium.longest_absolute_file_path.LongestAbsoluteFilePath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testLongestAbsoluteFilePath(){

        //LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePath();

        //ssertEquals(longestAbsoluteFilePath.getLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"), 32);
        //assertEquals(longestAbsoluteFilePath.getLongestPath(""), 0);

    }
}
