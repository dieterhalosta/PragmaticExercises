package org.fasttrackit.westaco_test;

public class UserInput {

        public static class TextInput {

        private final static StringBuilder stringBuilder = new StringBuilder();

        public void add(char c) {
            stringBuilder.append(c);
        }

        public static String getValue(){
            return stringBuilder.toString();
        }

    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(final char ch) {
            if (Character.isDigit(ch))
                super.add(ch);
        }
    }

        public static void main(String[] args) {
            TextInput input = new NumericInput();
            input.add('1');
            input.add('a');
            input.add('0');
            System.out.println(input.getValue());
        }
}
