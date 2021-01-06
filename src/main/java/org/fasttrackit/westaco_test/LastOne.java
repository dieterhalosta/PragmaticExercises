package org.fasttrackit.westaco_test;
import java.util.concurrent.Callable;

public class LastOne {

    /*
    *   Add the missing code to Hen and Egg so the following actions are completed:
    *  * Hen implements the Fowl interface.
    *  * A Hen lays an egg that will hatch into a new Hen.
    *  * Eggs from other types of fowls should hatch into a new fowl of their parent type.
    *  * Hatching an egg for the second time throws a IllegalStateException.
    * */

    interface Fowl {
        Egg lay();
    }

    public static class Hen {
        public Hen() {
        }

        public static void main(String[] args) throws Exception {
            Hen hen = new Hen();
            System.out.println(hen instanceof Fowl);
        }
    }

    class Egg {
        public Egg(Callable<Fowl> createFowl) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }

        public Fowl hatch() throws Exception {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    }
}
