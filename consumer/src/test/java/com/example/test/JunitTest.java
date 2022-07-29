package com.example.test;

import org.junit.jupiter.api.*;

@DisplayName("my first test example")
public class JunitTest {
    @BeforeAll
    public static void init() {
        System.out.println("init data");
    }
    @AfterAll
    public static void cleanup(){
        System.out.println("clean data");
    }
    @BeforeEach
    public void tearup(){
        System.out.println("current test method begin");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("current test method down");
    }
    @DisplayName("my first test method")
    @Test
    public void test1(){
        System.out.println("my first test method");
    }

    @Test
    @DisplayName("Assertions 断言校验")
    public void test2(){
        int[] num = {0,1,2,3,4};
        Assertions.assertAll("num",
                () -> Assertions.assertEquals(num[0],0),
                () -> Assertions.assertEquals(num[1],1));
    }

}
