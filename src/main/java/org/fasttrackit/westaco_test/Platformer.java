package org.fasttrackit.westaco_test;

import java.util.ArrayList;

public class Platformer {
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
