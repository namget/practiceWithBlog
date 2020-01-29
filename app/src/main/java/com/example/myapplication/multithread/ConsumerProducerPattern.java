package com.example.myapplication.multithread;

import java.util.LinkedList;

//소비자와 생산자의 패턴 스레드는 자신들 사이에 공유되는 리스트를 통해 공동작업을 수행한다.
public class ConsumerProducerPattern {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    lock.wait();
                }
                list.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait();
                }
                int value = list.removeFirst();
                lock.notify();
            }
        }

    }

    public void main() {

    }


    public class CPTest {
        final ConsumerProducerPattern cp = new ConsumerProducerPattern();

        public void main() {
            new Thread(() -> {
                try {
                    cp.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    cp.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
