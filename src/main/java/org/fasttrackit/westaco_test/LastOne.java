package org.fasttrackit.westaco_test;
import java.util.concurrent.Callable;

public class LastOne {
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
