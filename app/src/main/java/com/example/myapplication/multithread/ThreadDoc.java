package com.example.myapplication.multithread;

/**
 * Zygote라는 특별한 프로세스를 시작해서 안드로이드 응용프로그래믜 시작시간을 단축시키려고 한다.
 * Zygote 는 미리 로드된 핵심 라이브러리의 전체 세트를 가지고 있음. 따라서 새로운 응용프로그램 프로세스는
 * 응용 프로그램에서 공유되는 핵심 라이브러리를 복사하지 않고 Zygote 프로세스에서 포크한다.
 */
public class ThreadDoc {
}
