package com.owoodev.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application : Main class<br>
 * @ SpringBootApplication 로 인해 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정됩니다.<br>
 * 이는 항상 프로젝트 최상단에 위치해야만 한다.
 */
@SpringBootApplication
public class Application {
    /**
     * SpringApplication.run 을 통해 내장 WAS 를 실행합니다.<br>
     * 이렇게 되면, 항상 서버에 톰캣을 설치할 필요가 없게 되고, 스프링부트로 만들어진 Jar 파일로 실행하면 됩니다.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
