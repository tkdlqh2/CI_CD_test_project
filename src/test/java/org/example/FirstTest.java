package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FirstTest {

    private First first;

    FirstTest(){
        this.first = new First();
    }

    @Test
    void TestHello() {
        assertEquals("Hello world!",first.hello());
    }
}