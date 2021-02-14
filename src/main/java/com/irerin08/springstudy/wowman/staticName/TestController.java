package com.irerin08.springstudy.wowman.staticName;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public String testCont() {
        testService.allArgsTest();
        return "Test";
    }

}
