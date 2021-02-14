package com.irerin08.springstudy.wowman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDTOTest {

    @Test
    public void test1(){
        TestDTO testDTO = TestDTO.of(4);
        assertNotNull(testDTO);
        assertEquals(0, testDTO.getPrice());
        assertEquals(0, testDTO.getDiscount());
        assertEquals(4, testDTO.getAmount());
        System.out.println("testDTO.getPrice() = " + testDTO.getPrice());
        System.out.println("testDTO.getDiscount() = " + testDTO.getDiscount());
        System.out.println("testDTO.getAmount() = " + testDTO.getAmount());

    }
}