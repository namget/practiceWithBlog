package com.example.myapplication;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest {

    int sharedResource;
    private ReentrantLock reentrantLock = new ReentrantLock();
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    @Test
    public void changeState() {
        reentrantLock.lock();
        try {
            sharedResource++;
        } finally {
            reentrantLock.unlock();
        }
    }

    //공유자원 변경 메서드
    @Test
    public void changeState_() {
        reentrantReadWriteLock.writeLock().lock();
        try {
            sharedResource++;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    //공유자원 읽는 메서드
    @Test
    public void readState() {
        reentrantReadWriteLock.readLock().lock();
        try {
            sharedResource++;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }


}
