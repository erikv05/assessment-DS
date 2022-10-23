package answers;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    
    /**
     * @brief This method should return a set of all integers that are
     * the same between setOne and setTwo. 
     * @return Intersect of both sets.
     */
    public static Set<Integer> intersect(Set<Integer> setOne, Set<Integer> setTwo) {
        Set<Integer> intersect = new HashSet<Integer>();
        for (Integer i : setOne) {
            intersect.add(i);
        } for (Integer i : setTwo) {
            intersect.add(i);
        } return intersect;
    }

}
