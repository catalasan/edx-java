package warmup;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Quadratic {

    /**
     * Find the integer roots of a quadratic equation, ax^2 + bx + c = 0.
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term.  Requires that a, b, and c are not ALL zero.
     * @return all integers x such that ax^2 + bx + c = 0.
     */
    public static Set<Integer> roots(int a, int b, int c) {
        //throw new RuntimeException("not implemented yet;"); // TODO: delete this line when you implement it
        //Finding out the roots
        Set<Integer> root = new HashSet<>();

        int discriminant = (b * b) - (4 * a * c);

        if (discriminant >= 0 || Math.abs(c) < 2_000_000_000) {
            int sqrt = (int) Math.sqrt(discriminant);
            root.add((-b + sqrt) / (2 * a));
            root.add((-b - sqrt) / (2 * a));
        } else {
            int sqrt = (int) Math.sqrt(Math.abs(c));
            root.add(sqrt);
            root.add(-sqrt);
        }
        return root;
    }

    
    /**
     * Main function of program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("For the equation x^2 - 4x + 3 = 0, the possible solutions are:");
        Set<Integer> result = roots(1, -4, 3);
        System.out.println(result);
    }

    /* Copyright (c) 2016 MIT 6.005 course staff, all rights reserved.
     * Redistribution of original or derived work requires explicit permission.
     * Don't post any of this code on the web or to a public Github repository.
     */
}
