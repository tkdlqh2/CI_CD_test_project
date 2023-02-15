package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SecondTest {

    private Second second;

    SecondTest(){
        this.second = new Second();
    }

    @Test
    void hi() {
        assertEquals("안녕!!",second.hi());
    }
}