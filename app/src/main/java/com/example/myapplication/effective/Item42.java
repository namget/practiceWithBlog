package com.example.myapplication.effective;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Item42 {

    public static void main() {

        List<String> words = new ArrayList<>();
        words.add("abc");
        words.add("acda");
        words.add("eab");
        words.add("abc");

        Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        Collections.sort(words, Comparator.comparingInt(String::length));

        words.sort(Comparator.comparingInt(String::length));

    }

    public enum OperationBefore {
        PLUS("+") {
            public double apply(double x, double y) {
                return x + y;
            }
        };
        //////////......
        private final String symbol;

        OperationBefore(String symbol) {
            this.symbol = symbol;
        }
    }


    public enum Operation {
        PLUS("+", (x, y) -> x + y),
        MINUS("-", (x, y) -> x - y),
        TIMES("*", (x, y) -> x * y),
        DIVIDE("/", (x, y) -> x / y);

        private final String symbol;
        private final DoubleBinaryOperator op;

        Operation(String symbol, DoubleBinaryOperator op) {
            this.symbol = symbol;
            this.op = op;
        }

        @Override
        public String toString() {
            return symbol;
        }

        public double apply(double x, double y) {
            return op.applyAsDouble(x, y);
        }

    }


}
