package com.irerin08.springstudy.wowman;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public void allArgsTest(){
//        TestDTO testDTO1 = TestDTO.defaultTestDTO();
//        System.out.println("testDTO1.getPrice() = " + testDTO1.getPrice());
//        System.out.println("testDTO1.getDiscount() = " + testDTO1.getDiscount());

//        testDTO1 = TestDTO.of(20000, 500);
//        System.out.println("testDTO1.getPrice() = " + testDTO1.getPrice());
//        System.out.println("testDTO1.getDiscount() = " + testDTO1.getDiscount());
//
//        TestDTO testDTO = TestDTO.of(10000, 400);
//        System.out.println("testDTO.getPrice() = " + testDTO.getPrice());
//        System.out.println("testDTO.getDiscount() = " + testDTO.getDiscount());
    }

}
