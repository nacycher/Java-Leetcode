package com.sky;


import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void test1() {
        System.out.println(add(100));
    }
    private int add(int num) {
        if (num == 1) {
            return 1;
        }
        return num + add(num -1);
    }
}
