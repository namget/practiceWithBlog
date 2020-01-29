package com.example.myapplication.multithread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest {

    int sharedResource;
    private ReentrantLock reentrantLock = new ReentrantLock();
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public void changeState() {
        reentrantLock.lock();
        try {
            sharedResource++;
        } finally {
            reentrantLock.unlock();
        }
    }

    //공유자원 변경 메서드
    public void changeState_() {
        reentrantReadWriteLock.writeLock().lock();
        try {
            sharedResource++;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    //공유자원 읽는 메서드
    public void readState() {
        reentrantReadWriteLock.readLock().lock();
        try {
            sharedResource++;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }


}
