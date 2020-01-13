package com.example.myapplication.effective;

import java.time.Instant;

public class Item19 {

    public class Super{

        public Super(){
            overrideMe(); // 잘못 된 예
        }

        public void overrideMe(){

        }

    }

    public final class Sub extends Super{
        private final Instant instant;

        public Sub() {
            instant = Instant.now();
        }

        @Override
        public void overrideMe() {
            System.out.println(instant);
        }
    }
    public void main(){
        Sub sub = new Sub();
        sub.overrideMe();
    }

}
