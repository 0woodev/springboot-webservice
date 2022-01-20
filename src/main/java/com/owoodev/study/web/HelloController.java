package com.owoodev.study.web;

import com.owoodev.study.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <@RestController> 의 역할 - JSON 을 반환하는 컨트롤러로 만들어 준다.<br>
 * <@ResponseBody> 를 모든 메소드마다 선언했던 것과 다르게 한번에 사용할 수 있게 해준다.<br>
 */
@RestController
public class HelloController {
    /**
     * HTTP Method 중 Get 요청을 받을 수 있는 API 를 만들어 준다.<br>
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
