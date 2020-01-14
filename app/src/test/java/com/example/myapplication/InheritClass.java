package com.example.myapplication;

import org.junit.Test;

public class InheritClass {


    @Test
    public void test() {
        SubSubClass subSubClass = new SubSubClass();
    }

    class Super {
        public Super() {
            System.out.println("Super");
        }
    }


    class Sub extends Super {
        public Sub() {
            System.out.println("Sub");
        }
    }

    class SubSubClass extends Sub {
        public SubSubClass() {
            System.out.println("SubSubClass");
        }
    }

}


