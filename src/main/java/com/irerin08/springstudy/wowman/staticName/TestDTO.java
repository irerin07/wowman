package com.irerin08.springstudy.wowman.staticName;

import lombok.Getter;

//@Data
//@AllArgsConstructor(staticName = "of")
//public class TestDTO {
//    private int price;
//    private int discount;
//
//    public static TestDTO defaultTestDTO(){
//        return new TestDTO(500, 100);
//    }
//}

@Getter
public class TestDTO {
    private int price;
    private int discount;
    private final int amount;

    private TestDTO(int amount){
        this.amount = amount;
    }


    public static TestDTO of(int i) {
       return new TestDTO(i);
    }
}
