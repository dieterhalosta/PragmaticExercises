package org.fasttrackit.westaco_test;

import java.util.ArrayList;

public class Platformer {

    /*
    *   A character in a platformer game is standing on a single row of floor titles numbered 0 to N, at position X.
    *
    *   When the character moves, the title at the previous position disappears. The character can only move left and right, and always
    * jumps over one title, and any holes. The character will not move if there are no titles left to move to (you do not need to implement
    * this in the code).
    *   Implement a class that models this behavior and can report the character's position efficiently with respect to time used.
    *   For example, newPlatformer(6,3) creates a row of 6 titles (numbered 0 to 5) and a character positioned on title 3 {0 1 2 [3] 4 5}.
    * A call to jumpLeft() moves the characted two titles to the left and the title at position3 disappears {0 [1] 2 4 5}. A subsequent call
    * to jumpRight() moves the character two titles to the right and the title at position 1 disappears, skipping titles that have disappeared
    * {0 2 [4] 5}. Calling position() method at this point should return 4.
    * */


    ArrayList<Integer> row = new ArrayList<Integer>();

    public Platformer(int n, int position) {
        for (int i=0; i < n; i++){
            row.add(i);
        }
        System.out.println(row);

        int pos = row.get(row.indexOf(position + 1));
    }

    public void jumpLeft() {

    }

    public void jumpRight() {

    }

    public int position() {
        int pos = 0;

        return pos;
    }

    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position()); // should print 3

        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1

        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4
    }
}
