//package org.example.services;
//
//import org.example.service.Calculator;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//    //test methods of addTwoNumber
//
//    @Before
//    public void init(){
//        System.out.println("Execute before each test case");
//        System.out.println("Started date:"+new Date());
//    }
//
//    @Test
//    public void addTwoNumberTest(){
//        int result=Calculator.addTwonumber(12,45);
//        int expected=57;
//        Assert.assertEquals(expected,result);
//    }
//
//    @After
//    public  void clean(){
//        System.out.println("Executed after each test case");
//        System.out.println("Ended date :"+new Date());
//    }
//    @BeforeClass
//    public static  void initAll(){
//        System.out.println("Executed before all test");
//        System.out.println("Started date:"+new Date());
//    }
//    @AfterClass
//    public static  void cleanAll(){
//        System.out.println("Executed after all test");
//        System.out.println("Started date:"+new Date());
//    }
//
//}
