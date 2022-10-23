package answers;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    
    /**
     * @brief This method should return a set of all integers that are
     * the same between setOne and setTwo.
     * Example: {1, 2, 3}, {3, 4, 5} -> {3}
     * @return Intersect of both sets.
     */
    public static Set<Integer> intersect(Set<Integer> setOne, Set<Integer> setTwo) {
        Set<Integer> intersect = new HashSet<Integer>();
        for (Integer i : setOne) {
            if (setTwo.contains(i)) {
                intersect.add(i);
            }
        }

        return intersect;
    }

    /**
     * @brief This method should return a set of all integers that are
     * not contained in both sets.
     * Example: {1, 2, 3}, {3, 4, 5} -> {1, 2, 4, 5}
     * @return Difference of the two sets.
     */
    public static Set<Integer> difference(Set<Integer> setOne, Set<Integer> setTwo) {
        Set<Integer> difference = new HashSet<Integer>();
        for (int i : setOne) {
            if (!setTwo.contains(i)) {
                difference.add(i);
            }
        } for (int i : setTwo) {
            if (!setOne.contains(i)) {
                difference.add(i);
            }
        }
        return difference;
    }

}
