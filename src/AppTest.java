import questions.*;
import helpers.*;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void testEightQueens() {
        Chess.init();
        assertEquals(EightQueens.solveEightQueensProblem(), 92);
    }

    @Test
    public void testReverseLL() {
        Node front = null;
        assertEquals(ReverseLL.reverse(front), front);
        front = new Node(3, new Node(4, new Node(5)));
        Node reverseExpected = new Node(5, new Node(4, new Node(3)));
        assertEquals(reverseExpected, ReverseLL.reverse(front));
        front.next = null; front.data = 3;
        assertEquals(new Node(3), ReverseLL.reverse(front));
    }

    @Test
    public void testReverseStack() {

        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> expected = new Stack<Integer>();
        assertEquals(expected, stack);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(stack, ReverseStack.reverseHalf(stack));
        stack.push(6);
        stack.push(7);
        expected.push(3);
        expected.push(4);
        expected.push(5);
        expected.push(7);
        expected.push(6);
        assertEquals(expected, ReverseStack.reverseHalf(stack));

    }

    @Test
    public void testSetMethods() {


        Set<Integer> one = new HashSet<Integer>();
        Set<Integer> two = new HashSet<Integer>();
        Set<Integer> expectSet = new HashSet<Integer>();

        assertEquals(expectSet, SetMethods.intersect(one, two));
        assertEquals(expectSet, SetMethods.difference(one, two));


        one.add(1);
        one.add(2);
        one.add(3);
        two.add(3);
        two.add(4);
        two.add(5);

        expectSet.add(3);

        assertEquals(expectSet, SetMethods.intersect(one, two));

        expectSet.remove(3);
        expectSet.add(1);
        expectSet.add(2);
        expectSet.add(4);
        expectSet.add(5);

        assertEquals(expectSet, SetMethods.difference(one, two));

    }

}
