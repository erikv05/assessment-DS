package answers;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseStack {
    
    public static Stack<Integer> reverseHalf(Stack<Integer> toReverse) {
        
        Queue<Integer> half = new LinkedList<Integer>();

        int origSize = toReverse.size();
        for(int i = 0; i < origSize / 2; i++) {
            half.add(toReverse.pop());
        } while(!half.isEmpty()) {
            toReverse.push(half.remove());
        }

        return toReverse;
    }

}
