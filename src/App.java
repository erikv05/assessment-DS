import answers.*;
import helpers.*;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Chess.init();
        EightQueens.solveEightQueensProblem();
        Node head = null;
        System.out.println(ReverseLL.Reverse(head));
        Stack<Integer> toReverse = new Stack<Integer>();
        toReverse.push(1);
        toReverse.push(2);
        toReverse.push(3);
        toReverse.push(4);
        toReverse.push(5);
        System.out.println(ReverseStack.reverseHalf(toReverse));
    }
}
