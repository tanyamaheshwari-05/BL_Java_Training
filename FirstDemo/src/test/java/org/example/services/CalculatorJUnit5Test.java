package org.example.services;

import org.example.service.Calculator;
import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorJUnit5Test {
    @BeforeEach
    public void init(){
        System.out.println("Execute before every test");
    }
    @BeforeAll
    public static  void initAll(){
        System.out.println("Executed before all test");
//        System.out.println("Started date:"+new Date());
    }
    @Test
    public void addTwoNumberTest(){
        int res= Calculator.addTwonumber(3,2);
        Assertions.assertEquals(5,res);
//        System.out.println(new Date());

    }
    @AfterEach
    public  void  cleanup(){
        System.out.println("Execute after every test");
    }
    @AfterAll
    public static  void cleanupAll(){
        System.out.println("Executed after all test");
//        System.out.println("Started date:"+new Date());
    }


}
