package easy.middle_linked;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinked {
      int val;
      MiddleLinked next;
      MiddleLinked() {}
      MiddleLinked(int val) { this.val = val; }
      MiddleLinked(int val, MiddleLinked next) { this.val = val; this.next = next; }
  }

class Solution {
    public MiddleLinked middleNode(MiddleLinked head) {

        List<MiddleLinked> linkedList = new ArrayList<>();

        while (head != null){

            linkedList.add(head);
            head = head.next;

        }

        return linkedList.get(linkedList.size()/2);
    }
}
