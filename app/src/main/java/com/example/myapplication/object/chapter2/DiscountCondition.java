package com.example.myapplication.object.chapter2;

public interface DiscountCondition {
    // 할인여부를 판단 하기 위해 사용할 순번을 인스턴스 변수로 전달
    boolean isSatisfiedBy(Screening screening);
}
